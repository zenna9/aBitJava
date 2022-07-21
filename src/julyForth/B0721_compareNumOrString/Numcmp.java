package julyForth.B0721_compareNumOrString;

public class Numcmp extends Tr {
	public Numcmp(String s, String t) {
		super(s,t);
	}
	
	public int cmp() {
		Double s =Double.parseDouble(getS());
		Double t =Double.parseDouble(getT());
		return s.compareTo(t);
	}
}
