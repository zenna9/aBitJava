package classPrac.JavaBase_Lectrue.B0722_compare3_1;

class Select3 implements Tr3{
    //Field Empty : 
    public String s;
    public String t;
    //Constructor
    //인터페이스에서 기본값 선언해줬는데..얘넨뭐야..
    public Select3(String s, String t){
        this.s = s;
        this.t = t;
    }
    //Method
    public Boolean check(String s, String t) {
        this.s = s;
        this.t = t;

        boolean snum = isnum(s);
        boolean tnum = isnum(t);
        if(snum&&tnum){
            return true;
        }else {
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

    //얘 멤버클래스..인스턴스 멤버클래스..?
    public class Strcmp{
        Strcmp(){};

        //Method
        public int cmp(){
            return (Select3.this.s).compareTo(Select3.this.t);
        }    
    }

    public class Numcmp{
        Numcmp(){};
        //Method
        public int cmp(){
            Double ds = Double.parseDouble(Select3.this.s);
            Double dt = Double.parseDouble(Select3.this.t);
            return ds.compareTo(dt);
        }    
    }
}
