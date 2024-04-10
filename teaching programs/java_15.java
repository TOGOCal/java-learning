public class java_15 {
    public static void main(String[] args) {
        int a = 1000000000;
        int b = 20;
        int c = a * b;
        long C = a * b;
        long CC = a * (long) b;
        System.out.println("" + c + "   " + C + "   " + CC);
        CC = 1L * a * (int) b;
        System.out.println(CC);
        // a乘b超出了int的量程，导致c输出了补码的最大值
        // 虽然C是long，但由于乘号左右都是int类型的值，导致程序返回值也是int，造成与c一样的结果
        // 当b被强制类型转化为long后，a*b的返回值变为了long，故而使得使得得到了正确的结果
        // 当直接写数据什么都不写的时候，默认为int类型，若是在其后加上L代表其为long类型，此时乘法返回值依然是long，故正确
    }
}
