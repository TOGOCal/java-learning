import java.beans.Encoder;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        char a;
        while(true){

            System.out.println("压缩文件：1");
            System.out.println("解压缩文件：2");
            System.out.println("退出程序：0");

            a = s.nextLine().charAt(0);
            if(a == '0'){

                break;
            }


            String place = s.nextLine();


            File file = new File(place);
            File dest;

            switch(a){

                case '1':
                    dest = new File(place+".zip");

                    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(dest));

                    toZip(file , out , file.getName());

                    out.close();
                    break;

                case '2':

                    String[] str = place.split("\\\\");

                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i < str.length - 1; i++){

                        sb.append(str[i]);

                        sb.append('\\');

                    }

                    dest = new File(sb.toString());

                    unZip(file ,dest);
                    break;

                default:
            }

            System.out.println("============================================");
        }

        s.close();
    }

    private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {

        File[] files = src.listFiles();

        for(File file : files){

            if(file.isDirectory()){

                toZip(file, zos, name+"\\"+file.getName());
            }else {

                //zip中的所有结构类型都是ZipEntry，所以要创建对象保存数据
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                //这后面的路径是在压缩包里面的路径，不是电脑绝对路径

                //将这个对象保存在zip中
                zos.putNextEntry(entry);

                //要将文件中的内容写进去，需要输入流和输出流
                //输出流由压缩流充当，缺少输入流没所以创建
                FileInputStream in = new FileInputStream(file);

                byte[] buffer = new byte[1024*1024];

                int len;

                while((len = in.read(buffer)) > 0){

                    zos.write(buffer, 0, len);
                }//进行复制

                in.close();
                zos.closeEntry();
            }
        }
    }

    private static void unZip(File file , File dest) throws IOException {

        ZipInputStream zis = new ZipInputStream(new FileInputStream(file));

        ZipEntry entry;//压缩包中每个文件或者文件夹类型都是ZipEntry

        while((entry = zis.getNextEntry()) != null){

            if(entry.isDirectory()){

                File newFile = new File(dest, entry.getName());
                newFile.mkdirs();//创建文件夹
            }else{

                FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()));
                byte[] buffer = new byte[1024*1024];

                int len;
                while((len = zis.read(buffer)) > 0){

                    fos.write(buffer, 0, len);
                }

                fos.close();

                zis.closeEntry();//代表压缩包中一个文件被处理完毕了
            }
        }

        zis.close();
    }

}