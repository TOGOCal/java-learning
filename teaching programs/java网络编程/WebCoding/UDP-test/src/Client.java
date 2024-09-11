import java.io.IOException;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {

        //创建客户端对象（会随机分配端口
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] bytes = "hello world".getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();//关闭连接防止占用资源
    }
}
