package julyForth.B0722_compare2;

//인터페이스 Ts를 받아옴
class Tr implements Ts{

    // Field
    String s, t;

    //Constructor
    public Tr(String s, String t){
        //받아올 s와 t를 Tr클래스에 넣어줌
        this.s = s;
        this.t = t;
    }
    //인터페이스의 cmp는 Strcmp와 Numcmp 에서 실현 예정
    @Override
    public int cmp() {
        return s.compareTo(t);
    }
}