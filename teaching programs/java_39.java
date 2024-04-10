/**
 * 关于常量池的理解
 */

public class java_39 {
    public static void main(String[] args) {
        String s1 = "我是sb";
        String s2 = "我是sb";
        String s3 = new String("我是sb");

        System.out.println(s1 == s2);// 此处s1==s2，是因为"我是sb"这个字符串被储存在了常量池中，s1，s2其实是这个字符串的首地址
        System.out.println(s1 == s3);// 但此时，s3是某个赋值函数的返回值，所以地址与1，2并不相同
        System.out.println(s1.equals(s3));// 字符串的equals方法比较的是字符串中每个字符是否相同，故而输出为true
    }
}
