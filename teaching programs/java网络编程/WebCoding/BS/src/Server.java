import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        System.out.println("--服务器启动--");

        ServerSocket socket = new ServerSocket(8080);

        while (true) {

            Socket s = socket.accept();

            System.out.println("有人上线了" + s.getRemoteSocketAddress());

            new ServerFunctionTread(s).start();
        }
    }
}
