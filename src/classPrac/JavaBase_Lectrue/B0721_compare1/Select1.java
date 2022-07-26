package classPrac.JavaBase_Lectrue.B0721_compare1;

class Select1 extends Tr1{
    //Field Empty : will get this at parents

    //Constructor
    public Select1(String s, String t){
        //call parent's field
        super(s,t);
    }
    //Method
    public Tr1 check() {
        //스트링을 받아와야하나..?
        String s = getS();
        String t = getT();

        boolean snum = isnum(s);
        boolean tnum = isnum(t);
        if(snum&&tnum){
            return new Numcmp1(s,t);
        }else {
            return new Strcmp1(s,t);
        }
    }
    public static boolean connect(Tr1 Q){
        int answ = 0;
        if(Q instanceof Numcmp1){
            answ = ((Numcmp1)Q).cmp();
        }else {
            answ = ((Strcmp1)Q).cmp();
        }
        if (answ==0){
            return true;
        }else{
            return false;
        }
    }

    private boolean isnum(String s){
        try {
            Double.parseDouble(s);
            return true;
    
        }catch (NumberFormatException e){
            return false;
        }
    }
}
