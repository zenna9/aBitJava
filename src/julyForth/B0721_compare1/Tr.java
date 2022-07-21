package julyForth.B0721_compare1;

class Tr {
    // Field
    String s, t;

    //Constructor
    protected Tr(String s, String t){
        //받아올 s와 t를 Tr클래스에 넣어줌
        this.s = s;
        this.t = t;
    }
    //Method 
    public String getT() {
        return t;
    }
    public String getS() {
        return s;
    }
}
