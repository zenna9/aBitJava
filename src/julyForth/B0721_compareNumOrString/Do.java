package julyForth.B0721_compareNumOrString;

import java.util.Scanner;

public class Do extends Tr {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		String t = inp.next();		
		
        Tr P=new Select(s, t);
        Tr Q=((Select)P).check();
        System.out.println(((Select)P).connect(Q));
		
	}
	
}
