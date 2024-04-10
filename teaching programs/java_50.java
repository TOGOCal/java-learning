/**
 * 对于较小的数的缓存操作
 */

public class java_50 {
    public static void main(String[] args) {

        /**
         * public static Integer valueOf(int i) {
         * 
         * if (i >= IntegerCache.low && i <= IntegerCache.high){//如果不在这个区间，则返回这个数组中的一个值
         * 
         * return IntegerCache.cache[i + (-IntegerCache.low)];
         * }
         * return new Integer(i);//如果不在这个区间，则返回一个新的对象
         * }
         */

        // 相当于由于较小的数调用比较频繁，故而提前存好方便调用（这是缓存相关的问题
        // 较小的数：char的范围：-123~127

        Integer a = 100;
        Integer b = Integer.valueOf(100);

        Integer c = 1000;
        Integer d = 1000;

        System.out.println(a == b);
        // '=='判断的是两个是不是同一个对象，换句话说，判断的是是不是两个相同的地址
        System.out.println(c == d);

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        // 对于equals方法而言，它比较的是两个对象的值，故相等

    }
}
