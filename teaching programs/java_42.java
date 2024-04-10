/**
 * 数组的使用
 * 数组也相当于对象
 * 数组的成员相当于数组的属性
 */

public class java_42 {
    public static void main(String[] args) {
        int arr[] = null;// 声明数组//与C语言不同的是，java中需要先进行申明才能
        // 这是基本数据类型的数组申请方式
        arr = new int[10];// 给数组分配空间

        for (int i = 0; i < 10; i++) {

            arr[i] = i;
            System.out.print(i + "\t");
        }

        System.out.println();

        // point_ point=new point_//相互理解
        point_ points[] = new point_[10];
        // point_ points[] = null;
        // points = new point_[10];// 相当于C语言中的struct point a中的a

        for (int i = 0; i < 10; i++) {

            points[i] = new point_();// 需要完成初始化，之前完成时引用对象被初始化为为了空指针，但还不能使用
        }

        for (int i = 0; i < 10; i++) {

            // points[i] = new point_();
            points[i].x = Math.random() * 10;
            points[i].y = Math.random() * 10;
        }
        method.pointsPrint(10, points);

    }
}

class point_ {

    double x;
    double y;

    public double distant(double x, double y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}

class method {

    public static void pointsPrint(int x, point_ points[]) {

        // point_ points[] = null;
        // points = new point_[10];//因为传递了参数，所以不需要再进行初始化
        for (int xx = 0; xx < x; xx++) {

            System.out.println(points[xx].x + "  ,  " + points[xx].y);
        }
    }
}
