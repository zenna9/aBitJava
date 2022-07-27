package classPrac.Network_Lecture.July27;
import java.io.*;
import java.net.*;
import java.util.*;

//수신 _ inputStream
class Reciever extends Thread{
      //-> 필드선언
    List<Socket> socketList; //얘를 통해 인풋과 아웃풋을 다 받아올수있게되겠져
    //생성자
    Reciever(List<Socket> socketList){
        this.socketList = socketList;
    }
    //메서드
    public void run() {
        String message="";
        while(message==""){
            try{
                for (Socket i : socketList) {
                    //받으면
                    InputStream is = i.getInputStream();
                    DataInputStream dis = new DataInputStream(is);
                    message = dis.readUTF();
                }
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        //보내기
        try {
            if(message!=""){
                for (Socket i : socketList) {
                    OutputStream os = i.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    dos.writeUTF(message);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//구현
public class Server06_toAll {
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
            for(Socket i:socketList){
                System.out.println(i.getInetAddress()+":"+i.getPort());
            }
        }
        //수신
        Reciever reciever = new Reciever(socketList);
        reciever.start();
    }
}
