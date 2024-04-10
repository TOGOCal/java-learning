
/**
 * 这里有n个正整数，a1,...,an...........................n
 * Alice 会先去掉其中最多d个数..........................d
 * //Alice去掉的都是大数，因为bob肯定会将前d个大数乘上负数使其尽量小
 * //可能需要考虑的情况：
 * 
 * Bob 接下来会将剩余的数中最多m个数乘以 -k...............m k
 * Alice 想要剩余数之和尽可能大，Bob 想要剩余数之和尽可能小。假设 Alice 和 Bob 都足够聪明，请问最后剩余数之和是多少。
 * 输入描述
 * 第一行一个正整数T，接下来有T组数据
 * 
 * 每组数据 2 行
 * 第一行 4 个数
 * 
 * n,m,k,d (2<=n<=10^5) (0<=m,d<=n) (1<=k<=10^4)
 * 第二行n个数，a1,a2,...,an(1<=ai<=10^9)//int可以存完
 * 
 * 保证$\sum n$不超过 10^5
 * 
 */

import java.util.Scanner;

public class 草稿 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        for (int t = 0; t < T; t++) {// 有多少组数据

            int n = s.nextInt();// 有多少个数字
            int arr[] = new int[n];

            int m = s.nextInt();// 最多多少个数乘上负数
            int k = s.nextInt();
            k = -k;// 乘上的系数是多少

            int d = s.nextInt();// 最多删除多少个数

            for (int i = 0; i < n; i++) {

                arr[i] = s.nextInt();
            } // 完成数组输入

            quickSort(arr, 0, n - 1);// 完成输入排序
            n -= d;// 之后不访问这部分内容即可

            for (int i = 0; i < m; i++) {

                arr[(n - 1) - i] *= k;
            } // 完成变化

            int sum = 0;
            for (int i = 0; i < n; i++) {

                sum += arr[i];
            }

            System.out.println(sum);

        }
        s.close();
    }

    public static void quickSort(int arr[], int L, int R) {

        if (L >= R) {

            return;
        }

        int p1 = L - 1;
        int p2 = R + 1;

        int according = arr[(int) (Math.random() * (R - L + 1)) + L];// 随机生成分界标准

        for (int i = L; i < p2; i++) {

            if (arr[i] < according) {

                swap(arr, i, p1 + 1);
                p1++;
            } else if (arr[i] > according) {

                swap(arr, i, p2 - 1);
                p2--;
                i--;
            }
        }

        quickSort(arr, L, p1);
        quickSort(arr, p2, L);
    }

    public static void swap(int arr[], int R, int L) {

        arr[R] = arr[R] ^ arr[L];
        arr[L] = arr[R] ^ arr[L];
        arr[R] = arr[R] ^ arr[L];

    }
}
