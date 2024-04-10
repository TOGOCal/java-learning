
/**
 * 时间类的使用
 * 用神奇的方法判断某年是不是闰年
 */

//import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class java_54 {

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");// 创建一种输入格式

        StringBuilder sb1 = new StringBuilder();
        sb1.append("-12-31");// 最终格式以得到某年12月31号对应该年的天数

        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.nextLine());
        String sd = ((sb1.reverse()).append(sb2.reverse())).reverse().toString();// 拼接，神奇吧

        Date da = f.parse(sd);// 通过刚刚创建的格式输入生成对应日期

        DateFormat f1 = new SimpleDateFormat("D");// 创建另一种输入格式（也可以是输出格式
        int how = Integer.valueOf(f1.format(da));// 将那一年对应的天数保存在值中

        if (how == 365) {
            System.out.println("是平年");
        } else {
            System.out.println("是闰年");
        }

        s.close();
    }
}
