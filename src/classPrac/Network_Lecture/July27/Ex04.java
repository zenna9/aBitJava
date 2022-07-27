package classPrac.Network_Lecture.July27;

class Ex04_1 extends Thread{
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s","-");
        }
        System.out.println("스레드에서 소요시간 : "+(System.currentTimeMillis() - Ex04.start));
    }
}

public class Ex04 {
    static long start = 0;
    public static void main(String[] args) {
        start = System.currentTimeMillis();

        //스레드 실행
        Ex04_1 t1 = new Ex04_1();
        t1.start();
        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s","|");
        }
        System.out.println("메인에서 소요시간 : "+(System.currentTimeMillis() - start));
        
    }    
}
