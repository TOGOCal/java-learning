
/**
 * 方法
 * （我感觉有点像C语言中的函数
 */

import java.util.Scanner;

public class java_24 {
    public static void main(String[] args) {// main方法是程序的入口（main函数），public，ststic为修饰符，暂时不管
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        System.out.println("bigger:" + bigger(a, b));
        System.out.println("smaller:" + smaller(a, b));

        number.close();
    }

    public static int bigger(int x, int y) {

        if (x >= y) {

            return x;
        }

        else {

            return y;
        }
    }

    public static int smaller(int x, int y) {

        if (x <= y) {
            return x;
        }

        else {
            return y;
        }
    }
}
