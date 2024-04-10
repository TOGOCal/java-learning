
/**
 * 用已有函数对数组进行拷贝
 * 
 */

import java.util.Scanner;

public class java_44 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("你想定义一个多大的数组：");
        n = s.nextInt();
        s.nextLine();

        int 原数组[] = new int[n];
        int 目标数组[] = new int[n];

        System.out.println("请输入数组");

        for (int i = 0; i < n; i++) {

            原数组[i] = s.nextInt();
        }

        System.out.print("你想从原数组哪里开始拷贝：");
        int orstart = s.nextInt() - 1;// 起始位置// 计算机是从0开始的，对人而言，第一个不是第0个
        System.out.print("你想从目标数组哪里开始拷贝：");
        int noStart = s.nextInt() - 1;// 目标位置
        System.out.print("你想拷贝几位：");
        int lenth = s.nextInt();

        System.arraycopy(原数组, orstart, 目标数组, noStart, lenth);

        for (int temp : 目标数组) {

            System.out.print(temp + " ");
        }

        s.close();

        // for(int i=0;i<n;i++){

        // 目标数组[i]=原数组[i];
        // }
    }
}
