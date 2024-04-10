
/**
 * 关于java中的输入指令
 */

import java.util.Scanner;//导入scanner这个类

public class java_16 {
    public static void main(String[] args) {
        Scanner sentense = new Scanner(System.in);// new表示创建一个对象

        System.out.println("姓名：");
        String name = sentense.nextLine();// 将得到的值返回到等号前面的变量中，nextLine表示以Line形式输入

        System.out.println("年龄：");
        int age = sentense.nextInt();// nextInt表示是以int的类型输入

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);

        sentense.close();// 关闭使用sentense这个变量
    }
}
