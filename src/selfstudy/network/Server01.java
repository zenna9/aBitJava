package selfstudy.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    //클라이언트가 quit 메시지를 통해 끄는 지속적 채팅 구현
    public static void main(String[] args) throws IOException{
        ServerSocket bServerSocket = new ServerSocket(0727);

        Socket bClientSocket = bServerSocket.accept();
        System.out.println(bClientSocket.getInetAddress()+"-is in");

        InputStream bIs = bClientSocket.getInputStream();
        
        
    }
}
