package julyForth.B0721_compare1;

class Select extends Tr{
    //Field Empty : will get this at parents

    //Constructor
    public Select(String s, String t){
        //call parent's field
        super(s,t);
    }
    //Method
    public Tr check() {
        //스트링을 받아와야하나..?
        String s = getS();
        String t = getT();

        boolean snum = isnum(s);
        boolean tnum = isnum(t);
        if(snum&&tnum){
            return new Numcmp(s,t);
        }else {
            return new Strcmp(s,t);
        }
    }
    public static boolean connect(Tr Q){
        int answ = 0;
        if(Q instanceof Numcmp){
            answ = ((Numcmp)Q).cmp();
        }else {
            answ = ((Strcmp)Q).cmp();
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
