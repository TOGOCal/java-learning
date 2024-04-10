/**
 * static的用法
 * static方法无法直接调用非static成员
 */

public class java_30 {// class是类

    int x, y;
    String name;
    static String character = "我是个点";

    static {// 静态初始化器（类在被加载的时候就开始执行这个程序，完成其中对静态属性的初始化

        character = "我可能是个点";
        // 作为一个静态的方法，也可以去调用其他静态的方法
    }

    public void printWhere() {

        System.out.println(this.x + "," + this.y);
        System.out.println(character);// 普通方法可以直接调用静态变量
    }

    public static void printCharacter() {

        // System.out.println(this.x);由于this非static成员，所以无法直接调用
        System.out.println(character);// character是static成员，所以可以直接调用
    }

    public static void staticPrintWhere() {

        java_30 a = new java_30();
        System.out.println(a.x + "," + a.y);// 就像main方法一样，可以在方法内部申请变量并进行打印
        System.out.println(character);// 但这个就可以直接调用
    }

    java_30() {// 构造器

        x = 0;
        y = 0;
        name = "point";
    }

    public static void main(String[] args) {// 这样看来如此书写的main函数也是一个静态的
        java_30 a = new java_30();

        System.out.println(character);// 可以直接调用
        // System.out.println(a.character);//并不从属于a
        System.out.println(a.x + "," + a.y);
        character = "我应该是个点";// 可以直接修改
        // 如此看来，static变量就像C语言写在main函数外部的变量一样，贯穿于这个类的整个范围
    }
}

// 历史遗留问题：问什么main寒素要定义在对象（类有点分不清楚）的内部