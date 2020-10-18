//反序显示一个整数
import java.util.Scanner;

public class Quiz64 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number:");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number){
        //int copy = number;
        if (number == 0){
            System.out.print(number);
        }

        while(number != 0){
            int mod = number % 10;
            number = number / 10;
            System.out.print(mod);
        }
    }
}
