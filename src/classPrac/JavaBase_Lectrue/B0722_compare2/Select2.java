package classPrac.JavaBase_Lectrue.B0722_compare2;

class Select2 extends Tr2{
    //Field Empty : will get this at parents

    //Constructor
    public Select2(String s, String t){
        //call parent's field
        super(s,t);
    }
    //Method
    public Tr2 check() {
        //스트링을 받아와야하나..?
        String s = getS();
        String t = getT();

        boolean snum = isnum(s);
        boolean tnum = isnum(t);
        if(snum&&tnum){
            return new Numcmp2(s,t);
        }else {
            return new Strcmp2(s,t);
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
