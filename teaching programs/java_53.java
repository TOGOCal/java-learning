/**
 * 不可变字符串使用陷阱
 */

public class java_53 {
    public static void main(String[] args) {
        String a = " ";
        long place1_1 = Runtime.getRuntime().freeMemory();// 获取当前内存剩余空间
        for (int i = 0; i < 5000; i++) {

            a = a + i;// 相当于创建了5000个对象
        }
        long place1_2 = Runtime.getRuntime().freeMemory();
        System.out.println(place1_1 - place1_2);

        StringBuilder sb = new StringBuilder(" ");
        long place2_1 = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 5000; i++) {

            sb.append(i);
        }
        long place2_2 = Runtime.getRuntime().freeMemory();
        System.out.println(place2_1 - place2_2);// 可以产生通用的效果，但是内存消耗的差别巨大

    }
}
