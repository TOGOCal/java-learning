/**
 * 语句块的使用
 * （C语言里面好像没有这个玩意
 */

public class java_25 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        {
            // int a=0;
            int c = 0;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } // 感觉像是定义了一个变量使用的时间，之后变量间就无效了

        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);
    }
}
