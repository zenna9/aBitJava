package classPrac.Network_Lecture.July27;

public class Ex03 {
    public static void main(String[] args) {
        //하나의 스레드로 처리
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
                System.out.printf("%s","-");
        }
        System.out.println("소요시간1 : "+(System.currentTimeMillis() - start));
        
        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s", "|");
        }
        System.out.println("소요시간2 : "+(System.currentTimeMillis() - start));
    }
}
