package classPrac.Network_Lecture;

public class Ex01 {
    
    public void input(String name) throws Exception {
        if(name.equals("test")) {
            throw new Exception();
        }
    }

    public void run() {
        System.out.printf("running!!!");
    }

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        int result;
        try {
            result = 100 / 0;
            ex01.input("qwer");
            ex01.input("test");
        } catch (ArithmeticException e){
            System.out.println("/ by zero");
            result = -1;
        } catch (Exception e){
            System.out.println("test is not valid name");
        } finally{
            ex01.run();
        }
    }
}
