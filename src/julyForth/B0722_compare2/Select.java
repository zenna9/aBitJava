package julyForth.B0722_compare2;

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

    private boolean isnum(String s){
        try {
            Double.parseDouble(s);
            return true;
    
        }catch (NumberFormatException e){
            return false;
        }
    }
}
