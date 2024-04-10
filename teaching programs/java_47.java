
/**
 * Object数组的使用
 * Object数组可以存放任何一种类型的数据，因为其为所有类的父类
 */

import java.util.Arrays;

public class java_47 {
    public static void main(String[] args) {
        Object obj[] = { "沈钰涵是sb", true, 1145 };// 如此看来，Object类里面可以存放任何一种类
        System.out.println(Arrays.toString(obj));// 可以通过这种方式进行打印
    }
}
