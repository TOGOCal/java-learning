import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ServerFunctionTread extends Thread{

    private Socket socket;


    public ServerFunctionTread(Socket socket){

        this.socket = socket;
    }


    @Override
    public void run(){

        try {
            OutputStream os = socket.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            String s = """
                    HTTP://1.1 200 OK
                    Content-Type: text/html charset=utf-8
                    
                    hello world
                    """;

            dos.writeUTF(s);

            dos.flush();

            dos.close();

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
