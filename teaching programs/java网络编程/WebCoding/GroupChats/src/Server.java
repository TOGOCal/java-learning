import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static List<Socket> socketList;

    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(8888);

        socketList = new ArrayList<>();

        System.out.println("服务器启动");

        while (true) {

            Socket s = socket.accept();


            System.out.println("有人上线了：" + s.getRemoteSocketAddress());

            socketList.add(s);
            //启动线程，分别处理不同的连接信息
            new ServerReaderTread(s).start();
        }


    }


}
