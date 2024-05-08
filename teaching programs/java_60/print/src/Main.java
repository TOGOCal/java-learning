import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {

    /**
     * 本关考验你：
     * 打印流的使用
     * 打印流属于高级流 分为字节打印流PrintStream和字符打印流PrintWriter
     * 同时，根据名字我们也可以知道，这种流只用输出功能，没有输入功能
     *
     * 打印流的优势：
     * 打印一次相当于 写出+换行+刷新
     *
     * 注：
     * 我们时常使用的System.out.println中System.out这个类就是有一个打印流，
     * 所以使用的println,print,printf等方法其实是这个打印流知识点的方法
     */

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        File file = new File("print\\source\\testGBK.txt");

        MethodStream methodStream = new MethodStream();

        methodStream.method2(file);
    }

    public static class MethodStream{

        public void method1(File file) throws FileNotFoundException {

            PrintStream ps = new PrintStream(file);

            ps.write(97);//普通的方法，与之前的write一样，写出buye对应的ascii码

            ps.close();
        }

        public void method2(File file) throws FileNotFoundException, UnsupportedEncodingException {

            PrintStream ps = new PrintStream(file , "GBK");

            ps.println("张三");//写出并自动换行，自动刷新

            ps.print("张三");//写出但是不自动换行

            ps.println();

            int a = 100;
            String str = "欸嘿";

            ps.printf("%d - %s" , a , str);//同c语言的printf
            //%n代表换行

            ps.close();
        }
    }

    public static class MethodWrite{
        /**
         * PrintWriter中所用方法与PrintStream类似
         * 不同点：Writer只能打印字符类型的数据
         * 但是这个类具有缓冲区，写出效率更高
         */

    }
}