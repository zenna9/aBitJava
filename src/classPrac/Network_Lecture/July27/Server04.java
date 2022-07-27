package classPrac.Network_Lecture.July27;
//혼자 다시해봐야함
// /Server04, Client04, : 클라이언트가 실행되면 메시지를 계속 보내되,
// 입력 메시지가 quit이면 연결종료
import java.io.*;
import java.net.*;
import java.util.Scanner;

//수신 _ inputStream
class Reciever extends Thread{
    //InputStream is = cs.getInputStream();으로 쓰던걸
    //받아와서 쓸 수 있도록 해줘야 함 
      //-> 필드선언
    Socket cs; //얘를 통해 인풋과 아웃풋을 다 받아올수있게되겠져
    //생성자
    Reciever(Socket cs){
        this.cs = cs;
    }
    //메서드
    public void run() {
        try{
            InputStream is = cs.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(dis != null){
                String message = dis.readUTF();
                System.out.println("send : "+message);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}

//발신
class Sender extends Thread{
    Socket cs;

    Sender(Socket cs){
        this.cs = cs;
    }
    public void run(){
        try{
            OutputStream os = cs.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            Scanner sc = new Scanner(System.in);
            while(dos!=null){
                String message = sc.nextLine();
                if(message.equals("quit")){
                    cs.close();
                    sc.close();
                }
                dos.writeUTF(message);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

//구현
public class Server04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(2222);
        System.out.println("server Started...");
        
        Socket cs = ss.accept();
        System.out.println("client IP : "+cs.getInetAddress());
        System.out.println("client Post : "+cs.getPort());
        
        //수신
        Reciever reciever = new Reciever(cs);
        reciever.start();

        //발신
        Sender sender = new Sender(cs);
        sender.start();

        ss.close();
    }
}
