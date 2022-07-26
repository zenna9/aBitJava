package classPrac.JavaBase_Lectrue.B0721_compare1;

class Tr1 {
    // Field
    String s, t;

    //Constructor
    protected Tr1(String s, String t){
        //받아올 s와 t를 Tr클래스에 넣어줌
        //생성자는 protected로 보호하는게 좋음..맞나..
        this.s = s; //Tr1의 s는 받아온 String s
        this.t = t;
    }
    //Method : getter setter
    public String getT() {
        return t;
    }
    public String getS() {
        return s;
    }
}
