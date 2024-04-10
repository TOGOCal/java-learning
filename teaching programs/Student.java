
/**
 * 面向对象编程：类
 * 同一个java源文件里可以定义多个类
 * 类中包含静态数据（属性
 * 以及动态行为（方法（函数，以为着做什么
 */
import java.util.Scanner;

public class Student {
    long id;
    int age;
    String name;

    public void study() {

        System.out.println("在学生这个类下面定义了方法，既这个类的行为——学习");
    }

    public void play() {

        System.out.println("在学生这个类下面定义的第二个方法，可以理解为学生的另一种动态行为");
    }

    public static void main(String[] args) {// main方法是程序的入口

        Student s1 = new Student();// 创建了一个student（这个类），名为s1；
        Scanner s = new Scanner(System.in);// 创建了一个输入的类名字叫做s？//待定，我还不清楚

        System.out.print("请输入姓名：");
        s1.name = s.nextLine();

        System.out.print("请输入学生编号：");
        s1.id = s.nextLong();

        System.out.print("请输入年龄：");
        s1.age = s.nextInt();

        System.out.println("你想进行什么操作：");
        System.out.println("学习请按1,玩请按2");

        int a = s.nextInt();
        myPrint(s1, a);

        s.close();
    }

    public static void myPrint(Student s1, int x) {

        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.age);

        if (x == 1) {

            s1.study();
        }

        else if (x == 2) {

            s1.play();
        }
    }

}
