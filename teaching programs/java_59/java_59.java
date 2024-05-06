package java_59;

import java.beans.Encoder;
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * 关于GBK，UTF-8等
 * GBK，UTF-8是Unicode字符集的其中两种编码方式
 * 例如一个汉字，
 */

/**
 * io流的使用
 * io流：输入流，输出流
 * io流还可以分为字符流和字节流
 * 字节流可以代表所有的程序，而字节流只能代表纯文本文件
 * 纯文本文件：通过windows自带的记事本打开，非乱码的就是纯文本文件
 * 字节流通过inputStream获取 通过outputStream输出
 * 字符流通过reader获取，通过writer改出
 */

public class java_59 {

    public static void main(String[] args) throws IOException {

        // method1.mainMethod1();
        // method1.mainMethod2();
        method1.mainMethod3();
        // method1.mainMethod4();
        // method2.mainMethod1();
        // method2.mainMethod2();
        // method2.mainMethod3();
        // method2.mainMethod4();
        // method2.mainMethod5();
        // method2.test();
        // method2.test2();
    }

    public static class method1 {

        /**
         * io流练习1：对文件进行写出
         */

        public static void mainMethod1() throws IOException {

            // 目的是写入，所以获取输出流（吗？
            FileOutputStream fos = new FileOutputStream("a.txt");
            // 如果文件不存在，会创建新的文件
            // 如果文件已经存在，则会清空文件

            // 写入数据
            fos.write(98);
            fos.write(97);
            // 可以进行多次写入

            // 释放资源
            fos.close();
        }

        public static void mainMethod2() throws IOException {

            FileOutputStream fos = new FileOutputStream("b.txt");

            byte[] bytes = { 97, 98, 99, 100, 101 };

            fos.write(bytes);

            fos.close();
        }

        public static void mainMethod3() throws IOException {


            FileOutputStream fos = new FileOutputStream("c.txt");

            String name = "张三";

            String encode = URLEncoder.encode(name, "UTF-8");

            String decode = URLDecoder.decode(encode, "GBK");

            byte[] bytes = decode.getBytes();

            fos.write(bytes);

            fos.close();
        }

        // 写入中文的方式

        // 平台默认UTF-8,所以当我写上这个代码的时候相当于String中是一串这样的二进制码(使用UTF-8)

        // 通过编码使得其成为张三两个汉字

        // 对汉字进行GBK解码
        // GBK 国guo标biao扩展kuo，使用两个字节储存汉字
        // 高位字节二进制一定以1开头，转成十进制后是个负数
        // 为什么这么规定：GBK兼容ASCII，所以为了和英文字符区分开来，这个开头为1，代表这个是两个字节组成的汉字

        public static void mainMethod4() throws IOException {
            // 演示不删除原文件，直接进行续写

            FileOutputStream fos = new FileOutputStream("c.txt", true);
            // 第二个参数打开续写开关：true

            String str = "abc";

            byte[] bytes = str.getBytes();

            fos.write(bytes);

            fos.close();
        }
    }

    public static class method2 {
        // inputStream的一些使用
        public static void mainMethod1() throws IOException {

            FileInputStream fis = new FileInputStream("b.txt");

            int c;
            while ((c = fis.read()) != -1) {

                System.out.println((char) c);
            }
            /**
             * 直接调用read会只读取一个byte，
             * 当读取不到时会返回-1
             */

            fis.close();
        }

        public static void mainMethod2() throws IOException {
            // 小文件的复制
            FileInputStream fis = new FileInputStream("b.txt");
            FileOutputStream fos = new FileOutputStream("b_copy.txt");

            int c;
            while ((c = fis.read()) != -1) {

                fos.write(c);
            }

            fos.close();
            fis.close();
        }

        public static void mainMethod3() throws IOException {

            FileInputStream fis = new FileInputStream("eihei.mp4");
            FileOutputStream fos = new FileOutputStream("eihei_copy.mp4", true);

            byte[] bytes = new byte[1024 * 1024 * 5];

            int len;

            while ((len = fis.read(bytes)) != -1) {

                fos.write(bytes, 0, len);
                // 从那个索引位置开始，读取几位
            }

            fos.close();
            fis.close();
        }

        public static void mainMethod4() throws IOException {

            FileReader fr = new FileReader("c.txt");
            //程序在获取中文的时候，java会根据所在电脑使用的编码方式进行获取，
            //例如windows使用GBK，所以java程序在获取的时候也是使用的GBK去获取，就不会导致出错

            // char[] crr = new char[10];

            int key;
            while ((key = fr.read()) != -1) {
                // read 的底层逻辑：
                // 如果遇到英文读取一个，遇到中文读取多个

                System.out.println((char) key);
            }

            fr.close();
        }

        public static void mainMethod5() throws IOException {

            FileWriter fw = new FileWriter("d.txt");

            fw.write("欸嘿");
            //"在调用write方法的时候其实不用这么麻烦
            //但是如果调用的是字节流的方式就需要进行转换
            //但是read和write调用的是字符流，它会调用电脑系统底层的编码方式进行修改，就不会出现乱码问题
            /**
             * 以下是我瞎猜的：
             * 这就是为什么java程序可以在程序中设置好的中文进行正确输出
             * 但是在控制台中的程序不能？（我试一下
             */

            fw.close();
        }

        public static void test() throws IOException{
            //该程序在编译器自带的控制台中可以正常进行文件书写
            //但是在电脑控制台中进行输入的时候就出错了

            Scanner s =new Scanner(System.in);

            String str =s.nextLine();

            FileWriter fw = new FileWriter("testInput.txt");

            fw.write(str);

            fw.close();

            s.close();
        }

        public static void test2() throws IOException{

            Scanner s =new Scanner(System.in);

            String str = s.nextLine();
            System.out.println(str);

            byte[] bytes = str.getBytes("GBK");
            str = new String(bytes, "GBK");

            FileWriter fw = new FileWriter("testInput.txt");
            fw.write(str);
            fw.close();
//            String encode = URLEncoder.encode(str, "GBK");
//            System.out.println(encode);
//
//            String decode = URLDecoder.decode(encode, "UTF-8");
//            System.out.println(decode);

//            FileOutputStream fos = new FileOutputStream("testInput.txt");
//
//            byte[] bytes = decode.getBytes();
//
//            fos.write(bytes);
//
//            fos.close();



            s.close();
        }
    }
}

/**
 * 字符流 read方法详解：
 * （下面的情景是空参的read方法
 * 当使用 read方法时，
 * 程序会创建大小为8192的字节数组（缓存区（避免程序每次都去访问文件导致速度低下  【字符流 FileInputStream没有缓存区
 * 在调用read方法的时候，会先去缓冲区中找，如果缓冲区中找不到就去访问文件，并尽可能多地将缓冲区装满
 * 如果文件中也找不到数据，就放回-1
 * 如果找到了数据，就会调用电脑底层的编码方式将数据解码成Unicode表中对应的值
 * 再返回这个值
 *
 * 有参的read方法：
 * 会将读取，解码，强转三步整合了，直接放在数组当中
 */

/**
 * 字符流的write方法详解：
 * 类似的，write方法也具有缓存区
 * 缓存区的数据在装满之后会字都保存在关联文件中
 * 或者程序中使用flush也会保存在里面
 * 或者关闭流的时候也会自动保存
 *
 */
