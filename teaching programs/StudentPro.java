
/**
 * 学习了构造器后
 * 用构造器的方式写Student.java中的程序
 */

import java.util.Scanner;

public class StudentPro {
    String name;
    long id;
    int age;

    public void study() {

        for (int i = 0; i < 10; i++) {

            System.out.println("学习中。。。");
        }
        System.out.println("完成学习！");
    }

    public void play() {

        for (int i = 0; i < 10; i++) {

            System.out.println("游戏中。。。");
        }
        System.out.println("玩累了！");
    }

    StudentPro(String _name, long _id, int _age) {// 编写构造器

        name = _name;
        id = _id;
        age = _age;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = s.nextLine();

        System.out.print("请输入学生编号：");
        long id = s.nextLong();

        System.out.print("请输入年龄：");
        int age = s.nextInt();

        System.out.println("你想进行什么操作：");
        System.out.println("学习请按1,玩请按2");

        int a = s.nextInt();

        StudentPro s1 = new StudentPro(name, id, age);

        myPrint(s1, a);

        s.close();

    }

    public static void myPrint(StudentPro s1, int x) {

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
