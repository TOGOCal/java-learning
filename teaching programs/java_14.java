/**
 * 自动类型转化（量小的类型可以转化成量大的类型）
 */

public class java_14 {
    public static void main(String[] args) {
        byte a1 = 10;
        short a2 = a1;
        int a = a2;
        long b = a;// int的类型可以自动转换成更大的long类型
        System.out.println(b);
        /**
         * long a=10;
         * int b=a;(这样将long转成int就会出现问题)
         */
    }
}
