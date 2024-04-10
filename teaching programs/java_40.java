
/**
 * 字符串的常见方法
 */

import java.util.Scanner;

public class java_40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("输入字符串：");
        String a1 = s.nextLine();
        // System.out.println(a1.length());

        System.out.print("输出第几个字符：");
        int index = s.nextInt();

        while (index > a1.length()) {// 判断字符串长度

            System.out.print("超出了字符串长度，请重新输入：");
            index = s.nextInt();// 输入访问时还是作为数组访问的，也就是不具有访问第i个元素的能力
            // 但是有访问第0个元素的能力
        }

        System.out.print("第" + index + "个字符是：");
        System.out.println(a1.charAt(index - 1));// char charAt(int index)

        System.out.print("在输入一串字符串判断是否相等：");
        // s.nextByte();
        s.nextLine();
        String a2 = s.nextLine();

        System.out.print("是否相等：");
        System.out.println(a1.equals(a2));// boolean equals(String others)
        System.out.print("忽略大小写后是否相等：");
        System.out.println(a1.equalsIgnoreCase(a2));// boolean equalsIgnoreCase(String others)
        System.out.print("是否是原字符串的子串：");
        int a = a1.indexOf(a2);
        if (a == -1) {

            System.out.println("false");
        } else {

            System.out.println("true");
            System.out.println("从头第" + (a + 1) + "个字符开始相等");
        }

        System.out.println("可以对你的字符串进行修改：");
        System.out.println("你可以选择将字符串中某种字符全部替换为其他的字符");
        System.out.println("如果不需要进行替换仅输入两个相同的字符就可以停止替换程序");

        s.close();
    }

}
