package classPrac.Network_Lecture.July27;

class SingletonThread implements Runnable{
    public void run() {
        System.out.println(Singleton.getInstance());
        
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        //new Singleton은 생성자가 Private이므로 안됨~!
        //객체 생성은 getInstance통해서만 가능함
        //getInstance는 static이므로 바로 불러올 수 있음
        for (int i = 0; i < 50; i++) {
            Thread singletonThread = new Thread(new SingletonThread());
            singletonThread.start();
        }

        //전부 같은게 나와야되는데 스레드가 많아지면 하나씩 다른 애들이 생기기도. 
        // instance==null 인 순간을 포착하는 스레드가 둘 이상일수도 있기 때문.
        //이를 방지하기 위해선 public """Synchronized""" static Singleton getInstance(){...}로 수정
        //그럼 Synchronized가 동시처리를 막고 대기시키므로 스레드여도 동시처리 노노. 속도 더느려짐
    }
}
