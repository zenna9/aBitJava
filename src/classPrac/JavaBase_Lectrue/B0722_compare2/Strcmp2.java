package classPrac.JavaBase_Lectrue.B0722_compare2;

public class Strcmp2 extends Tr2{
    //constructor
    // 도대체 왜 얘는 private가 안되고 public이어야 할까?
    public Strcmp2(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        String s = getS();
        String t = getT();

        return s.compareTo(t);
    }    
}
