package classPrac.Network_Lecture.July27;

class Ex1_0 extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Ex1_1 : "+i);
        }
    }
}

class Ex1_2 implements Runnable{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Ex1_2 :"+i);
        }
        
    }
}
public class Ex1_1{
    public static void main(String[] args) {
        //스레드 클래스를 상속받은 애는 new 객체생성후
        //start 메서드를 호출해주면 됨
        //run 메서드를 호출하는게 아님
        Ex1_0 t1=new Ex1_0();
        t1.start();

        //근데 인터페이스 상속받은애는 구현이 조금 다름
        Runnable r = new Ex1_2();
        Thread t2 = new Thread(r);

        t2.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main : "+i);
        }
        //실행해보면 뭔가 순서가 1_0 다음에 1_2가 되는게 아니라
        //같이 실행되는것을 확인가능
        //근데 실제로는 두개의 코어가 각자 달리는 형태가 아니라
        //두개의 스레드를 왔다갔다 하는 하나의 코어가 있는 셈
        //그 스레드를 왔다갔다 하기 위해 오히려 시간이 더 소요됨

        //start메서드를 쓰면 공간을 만들고
        // 그 안에서 run을 돌림
        // 그냥 run을 돌리면 공간 별도로 만들지않고 실행
    }
}