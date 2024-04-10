
/**
 * 通过构造器的互相调用理解this的用法
 */

import java.util.Scanner;

public class java_29 {
    int x, y, z;

    public void sb() {

        System.out.println("你是傻逼");
    }

    public void xc() {

        System.out.println("你是消愁");
    }

    java_29() {

        System.out.println("调用了无参的构造器");
    }

    java_29(int x, int y) {

        this();// 通过这种方法调用无参的构造器（不能写java_29()这样调用
        // 且这个要调用也需要写在第一个

        this.x = x;
        this.y = y;// 此时不能写x=x；
    }

    java_29(int x, int y, int z) {

        this(x, y);// 同理

        this.z = z;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        java_29 a = new java_29(s.nextInt(), s.nextInt(), s.nextInt());

        System.out.println(a);// 这样只会打印a的地址（类@地址

        System.out.println(a.x + "," + a.y + "," + a.z);

        s.close();
    }
}
