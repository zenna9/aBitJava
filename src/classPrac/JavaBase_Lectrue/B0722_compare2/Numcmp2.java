package classPrac.JavaBase_Lectrue.B0722_compare2;

public class Numcmp2 extends Tr2{
    //constructor
    public Numcmp2(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        Double ds = Double.parseDouble(getS());
        Double dt = Double.parseDouble(getT());

        return ds.compareTo(dt);
    }    
}
