package classPrac.Network_Lecture.July26;
import java.io.BufferedReader;
//======소켓=======
//Client01.java의 숫자와 같이 보면서 순서 구분
import java.io.*;
import java.net.*;


public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        
        //2

        Socket clientSocket = serverSocket.accept();

        //거부할 사용자를 확인하기 위하여 파일을 불러들이고, ArrayList에 집어넣음
        // ArrayList<String> blackLists = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("c:\\Java\\aaBitJava\\blacklist.txt"));
        while(true){
            String line = br.readLine();
            if (line==null){ 
                break;
            // }else{
                
                //         blackLists.add(line);
                //     }
                //강사님코드는
            }else if(line.equals(""+clientSocket.getInetAddress())){
                System.out.println("너차단");
                clientSocket.close();
                System.exit(0);
            }
                // }
                // String address = clientSocket.getInetAddress()+"";
                // for (String i: blackLists) {
                    //     System.out.println(i);
        //     if(address.equals(i)){
        //         System.out.println("거부한 사용자가 접속했다");
        //         clientSocket.close();
        //         System.exit(0);
        //     }else{System.out.println("가능한 사용자");}
        // }

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
}
