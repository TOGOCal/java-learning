
/**
 * 使用Arrays类对数组进行操作
 */

import java.util.Scanner;
import java.util.Arrays;

public class java_45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("定义数组大小：");
        int n;
        n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("输入数组元素：");
        for (int i = 0; i < n; i++) {

            arr[i] = s.nextInt();
        }
        s.nextLine();

        boolean key = true;
        while (key) {

            menu.printmeun();
            char function = (s.nextLine()).charAt(0);
            switch (function) {
                case '1':
                    Arrays.sort(arr);
                    break;

                case '2':
                    Arrays.sort(arr);
                    for (int i = 0; i < n / 2; i++) {

                        int copy = arr[i];
                        arr[i] = arr[n - 1 - i];
                        arr[n - 1 - i] = copy;
                    }
                    break;

                case '3':
                    System.out.println(Arrays.toString(arr));
                    break;

                case '4':
                    System.out.println("查找你要查找的元素：");
                    int find = s.nextInt();
                    s.nextLine();
                    int a = Arrays.binarySearch(arr, find);
                    if (a == -1) {

                        System.out.println("没有找到你需要找的元素");
                    } else {

                        System.out.println("你查找的元素在第" + (a + 1) + "位");
                    }
                    break;

                case '5':
                    key = false;
                    break;

                default:
                    System.out.println("无效输入");
                    break;
            }
            menu.printdepart();
        }

        s.close();
    }
}

class menu {

    public static void printmeun() {

        System.out.println("请选择你需要的操作");
        System.out.println("多输入以输入的第一个字符算");
        System.out.println("1.从小到大排列数组\t2.从大到小排列数组");
        System.out.println("3.打印数组\t4.查找数组元素");
        System.out.println("5.关闭程序");
    }

    public static void printdepart() {

        System.out.println("\n==========================================\n");
    }
}
