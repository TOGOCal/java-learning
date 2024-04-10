public class java_8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean c = a > b;// boolean为布尔运算，起值仅有true和false两种
        System.out.println(c);

        char d = 'h';
        System.out.println((int) d);// d本来是一个char类型的变量
                                    // 通过在前面加上括号（），括号中的是将其强制类型转化的类型
        boolean e = d > 100;
        System.out.println(e);
    }
}
