package julyForth.B0721_compareNumOrString;

public class Strcmp extends Tr{
	
	public Strcmp(String s,String t) {
		super(s,t);
	}
	
	public int cmp() {
		String s= getS();
		String t = getT();
		return s.compareTo(t);
		
	}
	
}
