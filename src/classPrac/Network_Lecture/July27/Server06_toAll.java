package classPrac.Network_Lecture.July27;
import java.io.*;
import java.net.*;
import java.util.*;

//수신 _ inputStream
class Reciever extends Thread{
      //-> 필드선언
      Socket cs;
    //생성자
    Reciever(Socket cs){
        this.cs = cs;
    }
    //메서드
    public void run() {
        try{
            InputStream is = cs.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(dis !=null){ //받은 메시지가 있다면
                String message = dis.readUTF();
                for (Socket client : Server06_toAll.socketList) {
                    OutputStream os = client.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    dos.writeUTF(message);
                }
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}

//구현
public class Server06_toAll {
    static List<Socket> socketList;

    public static void main(String[] args) throws IOException {
        //클라이언트 리스트 생성
        List<Socket> socketList = new ArrayList<>();
        
        ServerSocket ss =new ServerSocket(2222);
        System.out.println("server Started...");
        
        //클라이언트 접속 시 리스트에 넣음
        Socket cs;
        while(true){
            cs = ss.accept();
            socketList.add(cs);
            //수신
            Reciever reciever = new Reciever(cs);
            reciever.start();
        }
    }
}
