/**
 * 方法的重载
 * (名字一样但是是完全不同的函数)
 * 不同的方法（函数）可以有相同的方法名（函数名）
 * 需要注意的是：
 * 不同：1.形参类型（例如一个是int，一个是char）
 * 2.形参个数不同 3.形参顺序不同（先int后char->char后int
 * 
 * 只有返回值不同不构成方法的重载
 * 只有形参的名字不同不构成重载（例如 int add（int x，int y)和int add (int xx,int yy)不构成重载
 */

public class java_26 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println(add(a, b));
        System.out.println(add(a, b, c));// 由于参数不同让程序知道了这是不同的程序（函数）
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

}
