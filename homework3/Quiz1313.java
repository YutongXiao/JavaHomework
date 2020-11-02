public class Quiz1313{
    public static void main(String[] args){
        Course course1 = new Course("Java");
        Course course2 = (Course)course1.clone();

        System.out.println("course1.getStudents() == course2.getStudents(): "
                + (course1.getStudents() == course2.getStudents()));
    }
}

class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    @Override //重写object类定义的clone方法
    public Object clone(){
        try{
            //先浅拷贝
            Course courseClone = (Course)super.clone();
            //深拷贝students域
            courseClone.students = (String[]) (students.clone());
            return courseClone;
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }

}
