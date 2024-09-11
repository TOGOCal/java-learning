import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReaderTread extends Thread{

    private Socket socket;

    public ServerReaderTread(Socket socket) {

        this.socket = socket;
    }

    @Override
    public void run() {


        try{

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            while (true){

                try{
                    String message = dataInputStream.readUTF();
                    System.out.println(socket.getRemoteSocketAddress() + ":" + message);
                }catch (Exception e){

                    System.out.println("有人下线了：" + socket.getRemoteSocketAddress());
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
