import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

public class Main {
    /**
     * 知识点介绍：对于字符流来说，其本身就具有缓冲区，所以运行速度方面也会快一些
     *
     * 虽然字节输入流不具有缓冲区，但是其有两个包装类
     * BufferInputStream 和 BufferOutputStream,这两个是InputStream和OutputStream的包装类（不是子类
     * 可以类似于并查集中的包装集合（类似（我的理解
     *
     * 需要通过传入InputStream或者OutputStream才能进行Buffer类的创建
     *
     */

    /**
     * 关于缓冲流快速的介绍：
     * 原本的InputStream,OutputStream是建立在文件和程序之间的通道
     * 在复制时相当于每次都要走一遍这个连接的通道
     * 而将数据放在缓冲区就可以不用那么频繁的走通道
     * 虽然在两个缓冲区之间还是一个一个地交换，但是内存运行的速度是非常快的
     * 如果在建立缓冲区的情况下还申请了字节数组byte[]，速度会更快，因为相当于
     * 两个缓冲区之间是一坨一坨地进行交换
     */

    /**
     * 对于字符流的buffer，虽然字符流（基本）本身包含了缓冲区
     * 但是buffer高级流有两个重要的方法
     * readLine可以读取一整行的数据（直到读到回车换行符
     *
     * 以及字符输出流特有的方法 newLine();可以跨平台地换行，Linux，windows，mac的换行方式是不一样的
     */

    public static void main(String[] args) throws IOException {
        //可以看出有缓冲区的速度快了很多

        FileInputStream fis = new FileInputStream("buffer\\source\\1.txt");
        FileOutputStream fos = new FileOutputStream("buffer\\source\\1_copy.txt");

        int b;

        long begin = System.currentTimeMillis();
        while((b = fis.read())!=-1){

            fos.write((char)b);
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间："+(end-begin)+"ms");

        fos.close();
        fis.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("buffer\\source\\1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffer\\source\\1_copy.txt"));

        begin = System.currentTimeMillis();
        while((b = bis.read())!=-1){

            bos.write(b);
        }
        end = System.currentTimeMillis();
        System.out.println("花费的时间："+(end-begin)+"ms");

        bos.close();
        bis.close();
    }
}