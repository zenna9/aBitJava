package classPrac.Network_Lecture;

public class MyStream2 {
    public void input(String name) throws Exception{ //3.throws가 예외를 처리해줌
        if(name.equals("test")){
            //1. 예외가 발생하면 2. 아래의 new 예외를 발생시키고
            throw new Exception();
        }
    }


    public void run(){
        System.out.println("i'm running! ");
    }

    public static void main(String[] args) {
        MyStream2 myStream2 = new MyStream2();
        int result0 ;
        //가장 기본적인 예외처리
        try {
            result0 = 100/0;
            myStream2.run();

            myStream2.input("qwer");
            myStream2.input("test");

        }catch(ArithmeticException e){
            System.out.println("Error");
            result0 = -1;
        }catch(Exception y){
            
        }finally{
            myStream2.run();
        }
        
    }
    
}
