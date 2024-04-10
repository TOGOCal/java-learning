/**
 * 逻辑运算操作符优先级
 * 非>与>或
 */

public class java_13 {
    public static void main(String[] args) {
        boolean 沈钰涵是sb = true;
        boolean 我是sb = false;
        boolean 沈钰涵不是消愁 = false;
        // 假或真为真，故而 真或假与假 如果按照顺序计算应该为 真或假与假 = 真与假 = 假
        // 但由于与的计算优先级较高，导致实际计算结果为 真或假与假 = 真或假 = 真
        // 由此导致计算结果不同
        System.out.println(沈钰涵是sb | 我是sb & 沈钰涵不是消愁);
        System.out.println((沈钰涵是sb | 我是sb) & 沈钰涵不是消愁);
        System.out.println(沈钰涵是sb | (我是sb & 沈钰涵不是消愁));

        System.out.println("\n");

        // 同样的道理，&&的优先级比||的优先级高
        // 证明：
        // 若优先运行短路或，则在读取到 沈钰涵是sb为真时应直接结束判断得出为真的结果，最后的输出结果确实为假
        System.out.println(我是sb || 沈钰涵是sb && 沈钰涵不是消愁);
    }
}
