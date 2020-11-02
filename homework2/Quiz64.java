//反序显示一个整数
import java.util.Scanner;

public class Quiz64 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number:");
        int number = input.nextInt();
        reverse(number);

        input.close();
    }

    public static void reverse(int number){
        int output = 0;  //a variable recording output times

        if (number == 0){
            System.out.print(number);
        }

        while(number != 0){
            int mod = number % 10;
            number = number / 10;

            if (mod != 0) {
                System.out.print(mod);
                output++;
            }
            else if (mod == 0 && output != 0){
                System.out.print(mod);
                output++;
            }
        }
    }
}
