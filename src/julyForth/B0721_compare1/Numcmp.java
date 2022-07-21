package julyForth.B0721_compare1;

import julyForth.B0722_compare2.Ts;

public class Numcmp extends Tr implements Ts{
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
