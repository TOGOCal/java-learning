/**
 * 测试java程序中的switch语句
 */

public class java_19 {
    public static void main(String[] args) {
        String people = "沈钰涵";
        switch (people) {// switch语句可以以字符串为判断标准

            case "沈钰涵":
                System.out.println("是消愁");
                break;

            default:
                System.out.println("不是消愁");
                break;
        }

    }
}
