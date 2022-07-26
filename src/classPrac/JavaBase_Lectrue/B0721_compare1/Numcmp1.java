package classPrac.JavaBase_Lectrue.B0721_compare1;


public class Numcmp1 extends Tr1{
    //constructor
    public Numcmp1(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        Double ds = Double.parseDouble(getS());
        Double dt = Double.parseDouble(getT());

        return ds.compareTo(dt);
    }    
}
