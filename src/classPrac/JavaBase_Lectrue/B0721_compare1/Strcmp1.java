package classPrac.JavaBase_Lectrue.B0721_compare1;

public class Strcmp1 extends Tr1{
    //constructor
    // 도대체 왜 얘는 private가 안되고 public이어야 할까?
    public Strcmp1(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        String s = getS();
        String t = getT();

        return s.compareTo(t);
    }    
}
