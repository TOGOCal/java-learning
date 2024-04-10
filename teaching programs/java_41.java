
/**
 * 字符串方法使用练习
 */

import java.util.Scanner;

public class java_41 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String crr = "";
        String srr;
        char function;
        // 用于保存输入的字符串
        boolean key = true;

        while (key) {
            /* meun m = */ new meun();
            System.out.println("现在的字符串：");
            System.out.println(crr);
            srr = s.nextLine();// 保存指令
            function = srr.charAt(0);

            switch (function) {

                case '1':
                    System.out.println("请输入新字符串");
                    crr = s.nextLine();
                    break;

                case '2':
                    System.out.print("该字符串的长度为：");
                    System.out.println(crr.length());
                    break;

                case '3':
                    System.out.println("查看第几个数字：");
                    int as = s.nextInt();
                    while (as > crr.length()) {

                        System.out.println("你的输入超出了字符串的范围，请重新进行输入");
                        as = s.nextInt();
                    }
                    s.nextLine();// 消掉输入缓存区的\n
                    System.out.print("第" + as + "个元素是：");
                    System.out.println(crr.charAt(as));
                    break;

                case '4':
                    meun._meun4();// 只能通过类名进行调用
                    // m._meun4();通过类实例化为对象后，访问静态方法是不合法的
                    srr = s.nextLine();
                    function = srr.charAt(0);
                    switch (function) {
                        case '1':
                            System.out.print("请输入需要判断的字符串：");
                            String crr1 = s.nextLine();
                            if (crr.equals(crr1)) {

                                System.out.println("相等");
                            } else {

                                System.out.println("不相等");
                            }
                            break;

                        case '2':
                            System.out.print("请输入需要判断的字符串：");
                            String crr2 = s.nextLine();
                            if (crr.equalsIgnoreCase(crr2)) {

                                System.out.println("相等");
                            } else {

                                System.out.println("不相等");
                            }
                            break;

                        case '3':
                            System.out.println("请输入需要判断的字符串：");
                            String srr3 = s.nextLine();
                            if (crr.indexOf(srr3) == -1) {

                                System.out.println("不是子串");
                            } else {

                                System.out.println("该字符串从正着数第" + (1 + crr.indexOf(srr3)) + "位出现");
                                System.out.println("该字符串从倒着数第" + (1 + crr.lastIndexOf(srr3)) + "位开始出现");// 理论上来说应该可以知道有多少个
                            }
                            break;

                        default:
                            System.out.println("输入有误");
                            break;
                    }
                    break;

                case '5':
                    meun._menu5();
                    srr = s.nextLine();
                    function = srr.charAt(0);
                    switch (function) {
                        case '1':
                            System.out.println("从某位置到尾部按1，从某位置到某位置按2");
                            srr = s.nextLine();
                            function = srr.charAt(0);
                            switch (function) {
                                case '1':
                                    int p = (s.nextLine()).charAt(0);
                                    crr = crr.substring(p);
                                    break;

                                case '2':
                                    int p1 = (s.nextLine()).charAt(0) - '0';
                                    int p2 = (s.nextLine()).charAt(0) - '0';
                                    crr = crr.substring(p1, p2);
                                    break;

                                default:
                                    System.out.println("输入有误");
                                    break;
                            }
                            break;

                        case '2':
                            System.out.print("请输入你想替换的字符：");
                            char bei = (s.nextLine()).charAt(0);
                            System.out.print("请输入你想将其替换为什么字符");
                            char zhu = (s.nextLine()).charAt(0);
                            crr = crr.replace(bei, zhu);
                            break;

                        case '3':
                            crr = crr.toLowerCase();
                            break;

                        case '4':
                            crr = crr.toUpperCase();
                            break;

                        default:
                            System.out.println("输入有误");
                            break;
                    }
                    break;

                case '6':
                    key = false;
                    break;

                default:
                    System.out.println("你的输出可能有误");
            }
            System.out.println("\n====================================\n");
        }
        s.close();
    }
}

class meun {

    meun() {

        System.out.println("请输入你想进行的操作：");
        System.out.println("如果误操作输入多个字符仅按第一个字符处理");
        System.out.println("1.创建新字符串\t        2.判断该字符串长度");
        System.out.println("3.查看字符串第i个数字\t4.对两个字符串进行判断");
        System.out.println("5.对字符串进行修改\t6.关闭程序");
    }

    public static void _meun4() {

        System.out.println("请输入你想进行的操作：");
        System.out.println("如果误操作输入多个字符仅按第一个字符处理");
        System.out.println("1.判断两字符串是否相等\t2.判断两字符串忽略大小写之外是否完全相同");
        System.out.println("3.判断新字符串是否是原字符串的子串");
    }

    public static void _menu5() {
        System.out.println("请输入你想进行的操作");
        System.out.println("如果误操作输入多个字符仅按第一个字符处理");
        System.out.println("1.截取该字符串中的一段\t2.将原字符串中所用某种字符替换为另一种字符");
        System.out.println("3.将所有大写字母改为小写字母\t4.将所有小写字母替换为大写字符");
    }
}
