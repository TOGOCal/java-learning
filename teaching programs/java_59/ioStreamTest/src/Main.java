package java_59.ioStreamTest.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File source = new File("ioStreamTest\\forCopy");

        File target = new File("ioStreamTest\\forCopy_copy");

        Solution so = new Solution();

        try {
            so.copyDirectory(source , target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Solution{

        public static void copyDirectory(File source , File target) throws IOException {
            //综合练习1：拷贝文件夹

            target.mkdirs();//创建文件夹
            //如果文件夹存在则这个代码运行失败，但是这不属于bug，不会报错

            File[] files = source.listFiles();//将目的地中所有文件获取在list中

            for(File file : files){
                //增强for循环,遍历其中每个文件
                if(file.isFile()){
                    //如果这是个文件
                    FileInputStream fis = new FileInputStream( file );
                    FileOutputStream fos = new FileOutputStream( new File(target, file.getName()) );

                    byte[] bytes = new byte[1024];

                    int len;

                    while((len = fis.read(bytes))!=-1){

                        fos.write(bytes,0,len);
                    }

                    fis.close();
                    fos.close();
                }else{
                    //这是个文件夹（也可以用isDirectory() , 那就调用递归
                    copyDirectory(file, new File(target, file.getName()));
                }

            }
        }
    }
}