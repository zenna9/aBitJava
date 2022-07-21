package julyForth.B0721_compare2;

public class Select extends Tr{
	
	public Select(String s, String t) {
		super (s,t);
	}
	
	public Tr check() {
		String s = this.getS();
		String t = getT();

		if(isNum(s)&&isNum(t)){
			return new Numcmp(s,t);
		} else {
			return new Strcmp(s,t);
		}
	}

	static boolean isNum(String s){
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


}
