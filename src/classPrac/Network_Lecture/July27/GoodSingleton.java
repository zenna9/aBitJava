package classPrac.Network_Lecture.July27;

//싱글톤 패턴 : 객체가 프로젝트에 하나만 존재할 수 있도로 ㄱ해줌
public class GoodSingleton {
    //thread-safe : 함수 | 변수|객체가 여러 스레드로부터 동시에 접근해도 
    // 대기시켜놓고 하나씩 처리하도록 만듦
    private GoodSingleton(){}

    public static GoodSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final GoodSingleton INSTANCE= new GoodSingleton();
    }
}
