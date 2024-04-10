//九九乘法表

public class java_21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {

            for (int y = 1; y <= i; y++) {

                System.out.print(i + "×" + y + "=" + (i * y) + "\t");// \t相当于tab，一般长度为8个空格
            }
            System.out.println();
        }
    }
}

/**
 * 
 * 1+1=2
 * 2+2=4 3+3=6
 * 4+4=8 5+5=10 6+6=12
 * 7+7=14 8+8=16.........
 * 在使用制表符tab:"\t"的时候，打印出的会自动对齐>>>>>>>重要（程序保存的时候把tab变成空格了，可以在cmd中运行程序查看
 */
