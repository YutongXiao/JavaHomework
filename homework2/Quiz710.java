//找出最小元素下标
import java.util.Scanner;

public class Quiz710 {
    public static void main(String[] args){
        double[] array = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for (int i=0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        int minIndex = indexOfSmallestElement(array);
        System.out.println("index of minimum number is " + minIndex);
    }

    public static int indexOfSmallestElement(double[] array){
        double minNum = array[0];
        int minIndex = 0;

        for (int i=0; i < array.length; i++){
            if (array[i] < minNum){
                minNum = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
