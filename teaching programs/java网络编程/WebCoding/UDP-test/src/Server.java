import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    public static void main(String[] args) throws IOException {

        System.out.println("服务器启动");

        //创建一个UDP的Socket服务
        DatagramSocket datagramSocket = new DatagramSocket(8888);

        //创建一个数据包，用于接收数据
        byte[] buffer = new byte[1024 * 64];//一包数据不会超过64KB的数据量


        //创建接收数据的包
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);


        //获取数据（当没有数据的时候会阻塞
        datagramSocket.receive(datagramPacket);


        //打印数据
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));


        //打印客户端ip
        System.out.println(datagramPacket.getAddress().getHostAddress());
        //打印客户端端口
        System.out.println(datagramPacket.getPort());

        //关闭连接
        datagramSocket.close();
    }
}
