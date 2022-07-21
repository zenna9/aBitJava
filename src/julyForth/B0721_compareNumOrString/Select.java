package julyForth.B0721_compareNumOrString;

public class Select extends Tr {
//	생성자
//	Select
	public Select(String s, String t) {
		super(s,t); 
	}
//	메서드
	//check===============
	public Tr check() {
		String s = getS();
		String t = getT();
		if (isNumeric(s) && isNumeric(t)) {
			return new Numcmp(s,t);
		}else {
			return new Strcmp(s,t);
		}
	}
	
	public boolean isNumeric(String s) {
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
	}
	
	//connect=============
	public int connect(Tr Q) {
        int ans=0;
        if(Q instanceof Strcmp){
            ans=((Strcmp)Q).cmp();
        }else{
            ans=((Numcmp)Q).cmp();
        }
        return ans;
	}
	
}
