package classPrac.Network_Lecture;
//======소켓=======
//Client01.java의 숫자와 같이 보면서 순서 구분
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server01 {
    public static void main(String[] args) throws Exception {
        //서버가 사용할 포트번호를 열어줘야 하는데 이걸 ServerSocket이 해줌
        //1.
        ServerSocket serverSocket = new ServerSocket(9999);
        //9999포트를 쓰겠다고 선언
        
        //2
        //클라이언트가 연결요청(3악수) 보냈을 때 응답을 주는 코드
        Socket clientSocket = serverSocket.accept();
        
        // clientSocket.getInputAddress(); //상대가 보낸 걸 읽을 스트림
        // clientSocket.getOutputStream(); //상대에게 보낼 수 있는 스트림

        //4
        InputStream is = clientSocket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //5
        int data = dis.readInt();
        System.out.println(data);
        
        clientSocket.close();
        //터미널에 netstat -ano 하면 9999로 통신중임을 확인 가능

        //현재 ..응답을 기다리고만 있는거래.. 클라이언트가 뭘 보내도 받을 수가 없대.
        //그래서 client01.java수정
    }
}
