//排序ArrayList
//debug: biginterger排序 + 前后打印行添加

import java.util.ArrayList;
import java.math.*;

public class Quiz133 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.0);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("8.00000000000000003"));

        System.out.println("Before sorting: ");
        for(Number i: list){
            System.out.print(i + " ");
        }

        sort(list);

        System.out.println("\nAfter sorting: ");
        for(Number i: list){
            System.out.print(i + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {

        //定义最小数值min和其下标minIndex，和暂存变量temp
        Number min = list.get(0);
        int minIndex = 0;
        Number temp = -1;

        for (int i = 0; i < list.size(); i++) {
            //更新min和minIndex为i位置
            min = list.get(i);
            minIndex = i;
            //找最小数值min和其下标minIndex
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < min.doubleValue()) {
                    min = list.get(j).doubleValue();
                    minIndex = j;
                }
            }

            //交换最小值j和现位i的位置，利用temp暂存i的值
            temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

    }
}
