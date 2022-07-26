package classPrac.Network_Lecture;

public class MyStream {
    public void run(){
        System.out.println("i'm running! ");
    }

    public static void main(String[] args) {
        MyStream myStream = new MyStream();
        int result0 ;
        //가장 기본적인 예외처리
        try {
            // BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
            //로컬에서 파일을 불러옴
            result0 = 100/0;
            myStream.run();

        }catch(ArithmeticException e){
            System.out.println("Error");
            result0 = -1;
        }finally{
            myStream.run();
        }
        
    }
    
}
