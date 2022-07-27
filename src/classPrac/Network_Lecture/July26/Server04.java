package classPrac.Network_Lecture.July26;
//======소켓=======
//교보문고의 http프로토콜은 어떻게 받아올까
import java.io.*;
import java.net.*;

public class Server04 {
    
    
    //클라이언트 소켓으로 HTTP요청을 만들어서 보내고 HTTP응답을 출력하라
    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("www.stco.co.kr",80);

        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBytes("GET / HTTP/1.1\r\nHost: www.stco.co.kr\r\n\r\n");
        // \n은 새 줄 의미
        // \r은 엔터 치는 것과 같음

        //응답을 받으려면 inputStream
        InputStream is = clientSocket.getInputStream();

        //콘솔에 찍을거야
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        while(true){
            String data = br.readLine();//한줄씩 읽을거야
            if(data ==null)break;
            System.out.println(data);//html이 한줄씩 콘솔에 출력됨
        }
        
        br.close();
        
        clientSocket.close();
    }
}
