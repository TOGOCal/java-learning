import java.io.*;
import java.nio.charset.Charset;

public class Main {

    /**
     * 高级流之：InputStreamReader,OutputStreamWriter
     * 转换流，这种高级流用于在字符流Reader，Writer之间互相转换，方便一些方法的调用和使用
     *
     * FileReader其实是InputStreamReader的子类
     * FileWriter是OutputStreamWriter的子类
     */

    public static void main(String[] args) throws IOException {

        File file = new File("StreamTypeChange\\source\\gbkTest.txt");
        //encodeTypeChange(file);
        readByLine(file);
    }

    public static void readByLine(File file) throws IOException {

        FileReader fr = new FileReader(file , Charset.forName("GBK"));

        BufferedReader br = new BufferedReader(fr);//需要一次读取一行的话，只能使用字符缓冲流的方法

        String line;

        while ((line = br.readLine()) != null) {

            System.out.println(line);
        }

        br.close();
        fr.close();
    }

    public static void encodeTypeChange(File file) throws IOException {

        FileReader fileReader = new FileReader(file , Charset.forName("GBK"));
        //现在的背景是我们已知文件使用的是GBK的编码方式

        FileWriter fileWriter = new FileWriter(new File("StreamTypeChange\\source\\utf-8Test.txt") , Charset.forName("UTF-8"));

        int ch;

        while ((ch = fileReader.read()) != -1) {

            fileWriter.write((char)ch);
        }

        fileWriter.close();
        fileReader.close();
    }
}