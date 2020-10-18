//求矩阵中各列数字的和
import java.util.Scanner;
    public class Quiz82 {
        public static void main(String[] args){
            double[][] m = readAMatrix(); //读入4x4数组
            double sum = sumMajorDiagonal(m);

            System.out.println("Sum of the elements in the major diagonal is " + sum);
        }
        public static double sumMajorDiagonal(double[][] m){
            double sum = 0;
            for (int i=0; i<m.length; i++){
                sum += m[i][i];
            }

            return sum;
        }
        public static double[][] readAMatrix(){
            double [][] m = new double[4][4];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a 4-by-4 matrix row by row: ");
            for(int i=0; i<4; i++){
                //System.out.print(i);
                for (int j=0; j<4; j++){
                    m[i][j] = input.nextDouble();
                }
            }
            return m;
        }
    }
