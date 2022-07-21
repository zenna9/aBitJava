package julyForth.B0721_compare2;

public class Tr {
	private String s,t;
	
	//생성자
	public Tr(String is, String it) {
		//Tr에 s가 들어온 경우, 이 s는
		this.s = is;
		this.t = it;
	}

	//게터
	//왜냐면 private로 필드를 지정해줘서 getter로 접근해야
	public String getS() {
		return s;
	}

	public String getT() {
		return t;
	}
	
}
