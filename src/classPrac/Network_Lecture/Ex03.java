package classPrac.Network_Lecture;

import java.io.*;

public class Ex03 {
    public static void main(String[] args) throws IOException{
        //        byte[] b = new byte[1024];
//        FileInputStream fis = new FileInputStream("c:/test/out.txt");
//        fis.read(b);

        BufferedReader br = new BufferedReader(new FileReader("c:/test/out.txt"));
        while(true){
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }

        //        System.out.println(new String(b));
        //        fis.close();
        br.close();
    }
}
