package classPrac.Network_Lecture.July26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
//파일 복사하는 기능 만들기
public class Ex04 {
    public static void main(String[] args) throws Exception{
        String addr = "c:\\Java\\aaBitJava\\";
        BufferedReader br = new BufferedReader(new FileReader(addr+"lecture.png"));
        PrintWriter pw = new PrintWriter(addr+"lecture2.png");

        while(true){
            String line = br.readLine();
            if(line ==null)break;
            pw.println(line);
        }
        br.close();
        pw.close();


    }
}
