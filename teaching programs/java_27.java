
/**
 * 关于递归的练习（阶乘
 * 并对递归运行的时间做计算
 */
import java.util.Scanner;

public class java_27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入你需要计算阶乘的数字：");
        int a = s.nextInt();

        long startTime = System.currentTimeMillis();// 该函数用于获取当前的时间，每经过1ms这个数字加1
        long b = fact(a);
        long stopTime = System.currentTimeMillis();
        System.out.println(a + "! = " + b);
        System.out.println("此次运算是时间为" + (stopTime - startTime) + "ms");
        s.close();
    }

    public static long fact(int x) {
        if (x == 0) {

            return 1;
        }

        else {

            return x * fact(x - 1);
        }
    }
}
