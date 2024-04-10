/**
 * 条件运算符，（C语言中的三目操作符）
 * 判断？返回1：返回2
 * 对条件进行判断，若判断为真，则返回1；若判断为假，则返回2
 * 类似于一个函数，有返回值，需要用对应的数据类型进行接受
 */

public class java_12 {
    public static void main(String[] args) {
        int a = 4;

        // 第一种写法
        String crr = a > 6 ? "a比六大" : "a比六小";// 类似于if的判断语句
        System.out.println(crr);

        // 第二种写法
        int score = 50;
        if (score >= 60) {
            crr = "及格";
        } else {
            crr = "不及格";
        }
        System.out.println(crr);

        // 时评给的案例进行分析
        int x = 100;
        int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);// 分析：若x>0，则返回1
                                                 // 若x<=0分为两种情况，若x等于0，则返回0；若x小于0，则返回-1
        /*
         * C语言函数书写：
         * int 某函数(int x)
         * {
         * if(x>0)
         * {
         * return 1;
         * }
         * 
         * else if(x==0)
         * {
         * return 0;
         * }
         * 
         * else
         * {
         * return -1;
         * }
         * }
         */
        System.out.println(flag);
    }
}
