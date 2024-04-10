
/**
 * 使用函数对字符串进行操作
 * 我猜的：使用StringBUilder的优势在于减少内存的开销
 */

import java.util.Scanner;

public class java_52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入字符串：");
        StringBuilder str = new StringBuilder(s.nextLine());
        // StringBuilder str=s.nextLine()
        // 这样写不行的原因是String不是像String那样的基本数据类型，其是一个类，故而需要用上面的构造器方式

        boolean key = true;

        while (key) {
            Functionmenu.menu();
            char x = (s.nextLine()).charAt(0);
            switch (x) {
                case '1':
                    System.out.print("输入字符串：");
                    str.append(s.nextLine());// 添加到原字符串末尾
                    break;

                case '2':
                    System.out.print("从第几个字符开始删除：");
                    int start = s.nextInt() - 1;
                    System.out.print("删除几个字符:");
                    int add = s.nextInt();

                    str.delete(start, start + add);
                    break;

                case '3':
                    System.out.print("删除第几个字符：");
                    int de = s.nextInt();
                    str.deleteCharAt(de - 1);
                    break;

                case '4':
                    System.out.print("在第几个字符后插入：");// 好像函数是在哪个字符前插入？
                    int offset = s.nextInt();
                    s.nextLine();
                    String str_ = s.nextLine();
                    str.insert(offset, str_);
                    break;

                case '5':
                    str = str.reverse();
                    break;

                case '6':
                    key = false;
                    break;

                default:
                    System.out.println("输入有误");
                    break;
            }

            System.out.println(str);
        }
        s.close();
    }
}

class Functionmenu {
    public static void menu() {
        System.out.println("*********************************");
        System.out.println("*请问你需要进行什么操作         ");
        System.out.println("*如果多输入按照输入的第一个字符算 ");
        System.out.println("*1.在字符串后拼接一串内容         ");
        System.out.println("*2.删除某段内容                ");
        System.out.println("*3.删除某个位置的字符           ");
        System.out.println("*4.在某个字符后插入某段字符串   ");
        System.out.println("*5.将字符串逆序排列             ");
        System.out.println("*6.关闭程序                     ");
        System.out.println("**********************************");
        System.out.println();
    }
}

/*
 * iafhowqef
 * 012345678
 * 123456789第
 */
