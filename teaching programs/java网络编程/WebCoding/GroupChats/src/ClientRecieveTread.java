import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

//用于客户端接收消息
public class ClientRecieveTread extends Thread{

    private Socket socket;

    public ClientRecieveTread(Socket socket) {

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

                    dataInputStream.close();
                    inputStream.close();

                    socket.close();

                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
