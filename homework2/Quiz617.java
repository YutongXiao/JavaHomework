//显示0和1构成的矩阵
import java.util.Scanner;

public class Quiz617 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter n:");
        int n = input.nextInt();
        printMatrix(n);

        input.close();
    }

    public static void printMatrix(int n){
        for(int i=0; i < n; i++){
            for(int k=0; k < n; k++){
                if (k != n-1){
                    System.out.print((int)(Math.random()*10)%2 + " ");
                }
                else{
                    System.out.print((int)(Math.random()*10)%2 + "\n");
                }
            }
        }
    }
}
