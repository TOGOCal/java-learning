import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        //获取Socket对象，同时请求服务器的连接
        Socket socket = new Socket("localhost", 8888);

        //获取字节输出流，用于传输数据
        OutputStream outputStream =socket.getOutputStream();

        //将字节输出流封装成字符输出流
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        //开始写数据
        dataOutputStream.writeUTF("你好，服务器！");
        dataOutputStream.close();

        socket.close();
    }
}
