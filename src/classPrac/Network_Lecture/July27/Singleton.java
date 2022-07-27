package classPrac.Network_Lecture.July27;

//싱글톤 패턴 : 객체가 프로젝트에 하나만 존재할 수 있도로 ㄱ해줌
public class Singleton {
    private static Singleton instance = null;
    
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance ==null){
            instance = new Singleton();
        }
        return instance;
    }
}
