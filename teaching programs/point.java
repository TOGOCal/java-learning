
/**
 * 构造器的使用
 * 1.构造器通过关键词new进行调用
 * 2.构造器虽然有返回值，但是不能定义返回值类型，其返回值肯定是本类
 * 3.如果没有自行编写构造器，则编译器会自动定义一个无参的构造方法，如果已定义则不会自动添加
 * 无参：不会向方法传参数
 * 4.构造器的方法名一定要与类名一样
 */

import java.util.Scanner;

public class point {
    double x, y;

    point(double _x, double _y) {// 自行定义的构造器是可以向其传参数的

        x = _x;
        y = _y;
    }

    public double longth(point p) {// 计算两点间的距离，此处可以看作定义了点a的一个行为，计算他与其他点的距离

        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        point a = new point(s.nextDouble(), s.nextDouble());
        point b = new point(s.nextDouble(), s.nextDouble());

        // System.out.println(a.x);
        // System.out.println(a.y);

        System.out.println("两点的距离是：" + a.longth(b));// 通过点a的行为，计算b与a的距离

        s.close();
    }
}
