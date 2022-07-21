package julyForth.B0721_compare2;

public class Do {
	public static void main(String[] args) {
		String s = "hello";
		String t = "hello";
		Tr P = new Select(s, t);
		Tr Q = ((Select)P.check());
		System.out.println(((Select)P.connect(Q)));


	}
}
