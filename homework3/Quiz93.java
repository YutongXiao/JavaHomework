//使用Date类
import java.util.Date;

public class Quiz93 {
    public static void main(String[] args){
        Date date = new Date();

        newTime(date, 10000L);
        newTime(date, 100000L);
        newTime(date, 1000000L);
        newTime(date, 10000000L);
        newTime(date, 100000000L);
        newTime(date, 1000000000L);
        newTime(date, 10000000000L);
        newTime(date, 100000000000L);
    }

    //设置新时间，转换为字符串打印
    public static void newTime(Date date, long elapseTime){
        date.setTime(elapseTime);
        System.out.println("When elapseTime is " + elapseTime + ", date is " + date.toString());
    }
}
