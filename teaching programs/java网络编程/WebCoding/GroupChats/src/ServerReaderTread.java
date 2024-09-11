import java.io.*;
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

                    message = socket.getRemoteSocketAddress() + ":" + message;

                    //发送群聊信息
                    sendMessageToAll(message);

                    System.out.println(message);
                }catch (Exception e){

                    System.out.println("有人下线了：" + socket.getRemoteSocketAddress());

                    Server.socketList.remove(socket);

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

    private void sendMessageToAll(String str) throws IOException {

        //推送消息
        for(Socket onLineSocket: Server.socketList){

            OutputStream out = onLineSocket.getOutputStream();

            DataOutputStream dos = new DataOutputStream(out);

            dos.writeUTF(str);

            dos.flush();
        }
    }
}
