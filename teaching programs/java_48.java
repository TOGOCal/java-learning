
/**
 * 测试javabean的使用
 * 测试通过已有库函数对多元对象进行排序
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class java_48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        emp aee[] = new emp[n];
        for (int i = 0; i < n; i++) {

            aee[i] = new emp();
            aee[i].lenth = s.nextInt();
        }

        Arrays.sort(aee);// 要使用则个必须先使类能实现Comparable这个接口
        System.out.println(Arrays.toString(aee));

        s.close();
    }
}

class emp implements Comparable<Object> {

    int lenth;
    String name;
    String date;// 如果要储存这样一系列变量，需要使用上节课的Object二维数组
    // Javabean规范使得可以将这些表格数据储存在一个类里面，这样只是用一维数组就可以解决问题了

    public String toString() {

        return (this.name + " " + this.lenth);
    }

    public int compareTo(Object o) {// 实现接口，这里比较的数就是之后sort进行排序的时候比较的数

        emp em = (emp) o;
        if (this.lenth < em.lenth) {

            return -1;
        }

        else if (this.lenth > em.lenth) {

            return 1;
        }

        return 0;

    }
}