//统计一位数的个数

public class Quiz77 {
    public static void main(String[] args){
        countDigits();
    }

    public static void countDigits(){
        int[] counts = new int[10];

        //随机生成100个数 并且有相应值的下标的值加一
        for (int i=0; i < 100; i++) {
            int digit = (int) (Math.random() * 10);
            counts[digit] += 1;
            System.out.print(digit + " ");
        }
        System.out.println();

        for(int k=0; k < counts.length; k++){
            System.out.print(k + ":" + counts[k] + ", ");
        }
    }
}
