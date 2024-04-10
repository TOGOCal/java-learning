/**
 * 循环语句的使用
 * 
 * 额，好像跟C语言一样
 */
public class java_20 {
    public static void main(String[] args) {

        System.out.println("欸嘿");

        int a = 0;
        while (a < 10) {
            for (int b = 0; b < 10; b++) {
                System.out.print("欸嘿 ");// println取消掉ln表示不用换行了
            }
            a++;
            System.out.println("");
        }
    }
}
