package classPrac.JavaBase_Lectrue.B0722_compare2;

//인터페이스 Ts를 받아옴
class Tr2 implements Ts2{

    // Field
    String s, t;

    //Constructor
    public Tr2(String s, String t){
        //받아올 s와 t를 Tr클래스에 넣어줌
        this.s = s;
        this.t = t;
    }
    public String getS() {
        return s;
    }
    public String getT() {
        return t;
    }
    //인터페이스의 cmp는 Strcmp와 Numcmp 에서 실현 예정
    @Override
    public int cmp() {
        return s.compareTo(t);
    }
}