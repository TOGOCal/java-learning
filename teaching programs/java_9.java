/**
 * 短路与，短路或（相当于把后面的内容短路了
 * 在进行逻辑运算的时候，一般的，与（&）前面的只要有假，则结果一定是假，但进行&运算的时候还会去计算后面的结果
 * 但是如果进行短路与（&&）运算时，一旦前面出现了假，则不再计算后面的内容，以提高计算速度
 * 或以及短路或同理
 * ！为取反操作符
 */

public class java_9 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        boolean a1 = (a > b) & ((c = 4) == 4);// 在进行逻辑比较时，返回值为boolean型数据类型（猜的
        System.out.println(a1);
        System.out.println(c);// 此时结果为4，说明c=4这条命令被执行

        c = 3;
        boolean a2 = (a > b) && ((c = 4) == 4);
        System.out.println(a2);
        System.out.println(c);// 此时结果为3，说明c=4这条命令没有被执行

        System.out.println(a1 ^ a2);// 异或，与次方（2^2)的运算符号相同，故而在进行逻辑运算是只用true和false而不像C语言使用0和1（猜的

        System.out.println(!a1);
    }
}
