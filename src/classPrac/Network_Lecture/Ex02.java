package classPrac.Network_Lecture;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) throws Exception{
        String addr = "c:\\Java\\aaBitJava\\";

        //파일 하나를 생성, 스트림을 열어줌
        FileOutputStream fos = new FileOutputStream(addr+"out.txt"); 
        // ^ 얘는 파일을 바이트 단위로 부름
        FileWriter fw = new FileWriter(addr+"out2.txt");
        PrintWriter pw = new PrintWriter(addr+"out3.txt");
        
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 라인";
            fos.write(data.getBytes());
            fw.write(data);
            pw.println(data);
        }
        fos.close();
        fw.close();
        pw.close();
    }
}
