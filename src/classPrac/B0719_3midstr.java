package classPrac;

import java.util.Scanner;

public class B0719_3midstr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("put an String to split :");
		String s = input.next();
		System.out.print("Index to start :");
		String a = input.next();
		System.out.print("how many : ");
		String b = input.next();
		
		String result = midstr(s, a, b);
		System.out.println("result is : "+result);
	}
	private static String midstr(String...str) {
		String answ = "";
		String s = str[0];
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		if(a<0||a>s.length()-1) {
			System.out.println("index to start is wrong");
			System.exit(0);
		}else if(b<=0||(s.length()-1)<b+a) {
			System.out.println("your last input is wrong");
			System.exit(0);
		}else {
			answ = s.substring(a,a+b);
		}
		return answ;
	}

}
