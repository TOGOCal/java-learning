/**
 * 关于方法的重写
 */

public class java_32 {
    public static void main(String[] args) {
        船 a = new 船();
        a.move();

        交通工具 b = new 交通工具();
        b.move();// 虽然 船 复写了交通工具的move，但是该复写仅在 船 这个类中生效
    }
}

class 交通工具 {

    String name;

    public void move() {

        System.out.println("向前移动");
    }
}

class 船 extends 交通工具 {

    @Override
    public void move() {// 对方法进行了复写

        System.out.println("虽乘奔御风，不以急也");
    }
}
