import java.util.Scanner;

public class java_51 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String crr1 = s.nextLine();
        System.out.println((int) crr1.charAt(crr1.length() - 1));
        System.out.println((int) '\n');// 通过比较这两个打印的内容可以看出，虽然nextLine可以消掉输入缓存区的

        System.out.println("==============================================");

        String str1 = s.nextLine() + s.nextLine();// 可以通过这种方式将两个字符串拼接起来
        System.out.println(str1);

        System.out.println("==============================================");

        String str2 = s.nextLine();
        String str3 = s.nextLine();
        String str4 = str2 + str3;

        System.out.println(str4);

        System.out.println("crr1==str4:" + (crr1 == str4));
        System.out.println("str1==str4:" + (str1 == str4));
        System.out.println("crr1==str1:" + (crr1 == str1));

        System.out.println("==============================================");
        System.out.println("以上是对输入拼接的测试");
        System.out.println();

        System.out.println("==============================================");
        System.out.println("一以下是使用String和+进行字符串凭借的结果");

        System.out.println("st1 = \"hello world\";");
        System.out.println("st2 = \"hello \" + \"world\";");
        System.out.println("st3 = \"hello \";\r\n" + //
                "st4 = \"world\";\r\n" + //
                "st5 = st3 + st4;");

        System.out.println();

        String st1 = "hello world";
        String st2 = "hello " + "world";

        String st3 = "hello ";
        String st4 = "world";
        String st5 = st3 + st4;

        System.out.println("st1==st2:" + (st1 == st2));
        System.out.println("s1.equals(st2):" + st1.equals(st2));

        System.out.println("st1==st5:" + (st1 == st5));// 不同的对象
        System.out.println("s1.equals(st5):" + st1.equals(st5));// 比较其中的内容时发现相等

        s.close();
    }
}
