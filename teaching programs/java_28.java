
/**
 * 由于java没有指针导致的一些问题
 */

//这个程序好像有点小问题，回来再改
import java.util.Scanner;

public class java_28 {// 依然以person为例子
    String name;
    int age;
    long id;// 创建person这个类下面的属性

    java_28() {
        name = "abcd";
        age = 18;
        id = 00000001L;
    }// 构建方法

    public void myPrint() {

        System.out.println(name + "\t" + age + "\n" + id);
    }

    public void myInput() {

        Scanner input = new Scanner(System.in);

        name = input.nextLine();// getLine()的时候好像会把空格算进去，故而使用这个时候不能以空格分隔输入
        age = input.nextInt();
        id = input.nextLong();
        // input.nextLine();

        input.close();
    }

    public static void main(String[] args) {

        java_28 s1 = new java_28();// 创建了一个新的s1，s1是java_28（person）这个类中的一个对象

        java_28 s2 = new java_28();// s2是与s1完全没有关系的对象，她是另一个java_28（person）

        s2.myInput();
        s1.myPrint();// 改变s2不会对s1造成影响
        System.out.println("如果你发现和原来的s1一样，说明并没有改变s1的值");

        java_28 s3 = s1;
        s3.myInput();
        s1.myPrint();
        System.out.println("如果你发现和原来的s1不同，说明该改变s3改变了s1的值");

    }

}
