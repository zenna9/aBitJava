package julyForth;

import java.util.Scanner;

public class ReversedArray {

	public static void main(String[] args) {
		System.out.print("put an string for array : ");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		System.out.print("put an char for delete : ");
		char c =sc.next().charAt(0);
		sc.close();
		
		String result0 = revsqueezeWhile(s,c);
		String result1 = revsqueezeForEach(s,c);
		System.out.println(result0);
		System.out.println(result1);
	}
	private static String revsqueezeWhile(String s, char c) {
		int leng = s.length();
		String temp = "";
		for (int i = leng-1; i >=0; i--) {
			if((s.charAt(i))!=c) {
				temp=temp+s.charAt(i);
			}
		}
		return temp;
		
	}
	private static String revsqueezeForEach(String s, char c) {
		String temp="";
		for (char str : s.toCharArray()) {
			if (str != c) {
				temp = str+temp;
			}
		}
		return temp;
	}

}
