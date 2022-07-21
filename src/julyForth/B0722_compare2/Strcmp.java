package julyForth.B0722_compare2;

public class Strcmp extends Tr implements Ts{
    //constructor
    // 도대체 왜 얘는 private가 안되고 public이어야 할까?
    public Strcmp(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        String s = getS();
        String t = getT();

        return s.compareTo(t);
    }    
}
