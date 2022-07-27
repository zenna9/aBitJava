package classPrac.Network_Lecture.July27;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server03 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(2222);
        
        //accept를 여러번 할 수 있게 반복문으로 만듦
        while(true){
            Socket cs = ss.accept();
            //포트번호 출력
            System.out.println("client IP : "+cs.getInetAddress());
            System.out.println("client Post : "+cs.getPort());
            OutputStream os = cs.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            //서버가 먼저 인사
            dos.writeUTF("hello~!~!!~!");
            
            //클라이언트의 챗을 받음
            InputStream is = cs.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String echo = dis.readUTF();
            System.out.println("Client Message : "+echo);

            //메시지를 에코+새 메시지 추가하여 보내기
            //띄어쓰기를 인식하기 위해 next말고 nextline를 사용
            Scanner input = new Scanner(System.in);
            System.out.print("Write Message for Client : ");
            String ServerMessage = input.nextLine();

            dos.writeUTF("reply for \'"+echo+"\'' : "+ServerMessage);

            input.close();
            dos.close();
            cs.close();
        }
    }
}
