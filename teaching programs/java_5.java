public class java_5 {
    public static void main(String[] args) {
        final double PI = 3.14;// 常量，类似于C中的define？//常量一般用全大写字母命名
        // PI=3.141;无法进行变更
        System.out.println(PI);
        double r = 2;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println("area=" + area);
        System.out.println("circle=" + circle);// 如此看来这个println的命令自带了换行功能
    }
}
