import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {

    public static void main(String[] args) throws IOException {

        System.out.println("--服务器启动--");

        //创建ServerSocket对象，绑定监听端口
        ServerSocket socket = new ServerSocket(8888);

        //调用accept()方法，接收客户端的请求，返回Socket对象
        Socket socketRec = socket.accept();

        //获取输入流，读取客户端发送的数据
        InputStream is = socketRec.getInputStream();

        //包装成高级流（同时也是因为发送数据的时候使用的是这个高级流发送的，网络传输是很严格的，必须要对称
        DataInputStream dataInputStream = new DataInputStream(is);

        System.out.println(dataInputStream.readUTF());

        //关闭资源
        dataInputStream.close();
    }
}
