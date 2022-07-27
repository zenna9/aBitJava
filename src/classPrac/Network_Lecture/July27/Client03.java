package classPrac.Network_Lecture.July27;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client03 {
    public static void main(String[] args) throws IOException{
        Socket cs = new Socket("192.168.1.10",2222);

        OutputStream os = cs.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = cs.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //스레드1
        //아웃풋 스트림으로 보내기
        System.out.println(dis.readUTF());
        Scanner input = new Scanner(System.in);
        String clientMessage="";
        boolean chatAgain = true;
        //보내기 반복처리
        while(chatAgain){
            if(clientMessage.equals("done")){
                System.out.println("exit this room");
                input.close();
                dis.close();
                cs.close();
                
            }else {
                clientMessage = input.nextLine();
                //메시지 보내기
                dos.writeUTF(clientMessage);

            }
        }
        //스레드2
        //인풋 스트림으로 echo 받기
        while(true){
            InputStream is2 = cs.getInputStream();
            DataInputStream dis2 = new DataInputStream(is2);
            String hostMessage =dis2.readUTF(); 
            if(hostMessage.equals("done")){
                System.out.println("Partner exit this chat room");
                input.close();
                dis.close();
                cs.close();
            }else{
                System.out.println("Host : "+hostMessage);
            }

        }
        //인풋

    }
}
