package classPrac.Network_Lecture.July27;


class Ex2_1 extends Thread{
    public void run() {
        //일부러 에러를 발생시켜볼것
        try {
            throw new Exception();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class Ex02{
    public static void main(String[] args) {
        Ex2_1 t1=new Ex2_1();
        t1.start();
        //thread main이 생성되고 그 안에서 run 실행.
        //run 안에서 예외가 발생한 것.에러됨
        //run이라는 공간 안에서 생긴 에러는 main 스레드와는 별도로 진행
        //그래서 run에서 에러가 생겨도 main의 아래 sysout은 잘 진행가능
        System.out.println("i'm running!");
    }
}