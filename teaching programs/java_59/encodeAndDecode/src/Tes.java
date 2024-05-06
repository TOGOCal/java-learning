import java.io.*;

public class Tes {
    public static void main(String[] args) {

//        File file = new File("encodeAndDecode\\source\\fufu.gif");
//        File file = new File("encodeAndDecode\\source\\bixin.jpg");
//
//        try {
//            encode(file);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        File file = new File("encodeAndDecode\\encode\\bixin.jpg");

        try {
            decode(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void decode(File file) throws IOException {

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("encodeAndDecode\\decode\\"+file.getName());

        byte[] bytes= new byte[1024];
        int len;

        while ((len = fis.read(bytes)) != -1) {

            for(int i = 1022; i >= 0; i--) {

                bytes[i] ^= bytes[i+1];
            }

            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }

    public static void encode(File file) throws IOException {

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("encodeAndDecode\\encode\\"+file.getName());

        byte[] bytes = new byte[1024];

        int len;

        while((len = fis.read(bytes))!=-1){

            for(int i =0;i<1023;i++){

                bytes[i] ^= bytes[i+1];
            }

            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}