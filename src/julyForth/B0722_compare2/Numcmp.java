package julyForth.B0722_compare2;

public class Numcmp extends Tr{
    //constructor
    public Numcmp(String s, String t){
        super(s,t);
    }
    //Method
    public int cmp(){
        Double ds = Double.parseDouble(getS());
        Double dt = Double.parseDouble(getT());

        return ds.compareTo(dt);
    }    
}
