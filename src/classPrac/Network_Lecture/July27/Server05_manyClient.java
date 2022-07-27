package classPrac.Network_Lecture.July27;
//혼자 다시해봐야함
// /Server04, Client04, : 클라이언트가 실행되면 메시지를 계속 보내되,
// 입력 메시지가 quit이면 연결종료
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//구현
public class Server05_manyClient {
    public static void main(String[] args) throws IOException {
        //클라이언트 리스트 생성
        List<Socket> socketList = new ArrayList<>();
        
        ServerSocket ss =new ServerSocket(2222);
        System.out.println("server Started...");
        
        //클라이언트 접속 시 리스트에 넣음
        while(true){
            Socket cs = ss.accept();
            socketList.add(cs);
            for(Socket i:socketList){
                System.out.println(i.getInetAddress()+":"+i.getPort());
            }
        }
    }
}
