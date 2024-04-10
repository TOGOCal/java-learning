
/**
 * 多维数组的使用
 */

import java.util.Scanner;

public class java_46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {

            int nn = s.nextInt();
            arr[i] = new int[nn];// 可以在后面才申明二维数组的元素
            // 同时也表明，数多维数组可以每行每列不相等
        }
        s.close();
    }
}
