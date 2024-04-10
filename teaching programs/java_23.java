/**
 * 打印质数
 * java语句中带标签的continue用法
 */

public class java_23 {
    public static void main(String[] args) {

        int counter = 0;
        ChengXu: for (int i = 1; i < 200; i++) {// 类似于C语言中的goto语句，但这里的goto仅限在这里使用，由内部循环跳到外部循环
            // 但是虽然是这么写的，这样并不会使得i被重新赋值为1，推测执行位置为i++前面
            for (int ii = 2; ii <= i / 2; ii++) {

                if (i % ii == 0) {
                    continue ChengXu;
                }
            }
            counter++;
            System.out.print(i + "\t");
            if (counter == 5) {

                System.out.println();
                counter = 0;
            }
        }
    }
}
