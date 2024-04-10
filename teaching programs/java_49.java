
/**
 * 自动装箱以及自动拆箱
 * 
 * 将基本数据类型与对象之间相互妆化
 */

import java.util.Scanner;

public class java_49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer i = 10;// i是个对象Integer是int类型的对象
        int j = i;// 对i这个对象自动拆箱
        // 等效于int j=i.intvalue;
        System.out.println(j);

        // 这种装箱的方式还可以将字符串装换成其对应的值
        String number = "456";
        j = Integer.valueOf(number);
        System.out.println(j + 1);// 可以进行加法，所以证明成功被转换成数字了

        s.close();
    }
}
