/**
 * 字符连接操作符‘+’
 * 只要‘+’两侧的操作数中有一个是字符串类型，则系统会将另一个操作数转换为字符串在进行连接
 */
public class java_11 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        String crr = "2";// 用String定义字符串
        System.out.println(a + b);
        System.out.println("sb " + a + b + (a + b));// "sb "为一个字符串，故而与其相连的a，b等被转化为了字符串
        char 沈 = 's';
        char 钰 = 'b';
        char 涵 = '\n';
        System.out.println(沈 + 钰 + 涵);// 此处没有字符串类型的数据，因此此操作的结果为对应的's','b','\n'字符对应的unicode编码的和
        System.out.println("沈钰涵是" + 沈 + 钰 + 涵);// 此处由双引号定义了一个字符串，此时变量被转为对应的字符
        System.out.println("" + 沈 + 钰 + 涵);// 若想直接打印出对应的字符串，可以在前面加上"",就不会产生影响

        System.out.println(crr + a + b);
    }
}
