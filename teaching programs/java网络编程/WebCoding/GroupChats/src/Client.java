import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8888);

        //创建独立线程接收服务端发送的消息
        new ClientRecieveTread(socket).start();

        //获取流
        OutputStream outputStream = socket.getOutputStream();

        //包装流
        DataOutputStream dos = new DataOutputStream(outputStream);

        Scanner s = new Scanner(System.in);

        while(true) {

            //System.out.println("请输入要发送的内容：");
            String str = s.nextLine();

            if(str.equals("exit")) {

                System.out.println("客户端退出");
                dos.close();
                socket.close();
                break;
            }

            //发送数据
            dos.writeUTF(str);

            dos.flush();
        }
    }
}
