package classPrac.Network_Lecture;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws Exception{
        //3
        //클라이언트에서 소켓 생성 : 얘가 실행이 되어야 서버가 값을 clientSocket에 넣어 반환할 수 있음
        Socket clientSocket = new Socket("192.168.1.20",8888);

        //4
        //클라이언트가 데이터를 전달하도록 해볼것
        OutputStream os=clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //6
        //숫자 하나를 전달해보자
        dos.writeInt(100);

        clientSocket.close();
        
    }
}
