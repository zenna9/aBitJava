package classPrac.Network_Lecture.July26;
//======소켓=======
//Client01.java의 숫자와 같이 보면서 순서 구분
import java.io.*;
import java.net.*;

public class Server03 {
    
    
    //클라이언트 소켓으로 HTTP요청을 만들어서 보내고 HTTP응답을 출력하라
    public static void main(String[] args) throws IOException {
        addr addrs = new addr();

        Socket clientSocket = new Socket("www.ddarahakit.kro.kr",80);

        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBytes("GET / HTTP/1.1\r\nHost: www.ddarahakit.kro.kr\r\n\r\n");

        //응답을 받으려면 inputStream
        InputStream is = clientSocket.getInputStream();

        //콘솔에 찍을거야
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        //이번엔 콘솔에 띄우지말고 파일로 저장해보쟝
        PrintWriter pw = new PrintWriter(addrs.addr+"\\lecturesite.html");

        while(true){
            String data = br.readLine();//한줄씩 읽을거야
            if(data ==null)break;
            System.out.println(data);//html이 한줄씩 콘솔에 출력됨
            pw.println(data);//html이 한줄씨 ㄱ저장됨
        }
        
        br.close();
        
        clientSocket.close();
    }
}
