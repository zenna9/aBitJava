package classPrac.Network_Lecture;

import java.io.*;

//파일(png) 복사하는 기능 만들기
public class Ex05 {
    public static void main(String[] args) throws Exception{
        String addr = "c:\\Java\\aaBitJava\\";
        FileInputStream fis=new FileInputStream(addr+"lecture.png");
        FileOutputStream fos=new FileOutputStream(addr+"lecture2.png");
        
        while(true){
            int b = fis.read();//String단위로 읽는게 아니므로 readline이 아님
            //read는 전부 다 읽으면 -1을 반환함
            if(b==-1)break;
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
