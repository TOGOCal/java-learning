public class java_7 {
    public static void main(String[] args) {
        char a1 = 'A';
        char a2 = '中';
        char a3 = '\u0061';// '\\u'后面加上该字符对应的unicode编码
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        String str = "傻逼";// 字符串不是基本数据类型，而使一个类
        System.out.println(str);

        char a4 = '\n';// 定义转义字符
        System.out.println("arr=" + a4 + str);
    }
}
