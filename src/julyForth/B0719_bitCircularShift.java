package julyForth;

import java.util.Scanner;

public class B0719_bitCircularShift {

	public static void main(String[] args) {
		System.out.print("num : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("n : ");
		int n = input.nextInt();
		System.out.println(circularShift(num,n));
	}
	public static String circularShift(int num, int n){
		String binaryChanged = Integer.toBinaryString(num);
		System.out.println("binary : "+binaryChanged);
		
		
		int check1=0X7FFFFFFF;
		int check2=0X80000000;
		for (int i = 0; i < n; i++) {
			if(num>0) {
				if ((num&1)==0){
					num=num>>1;
				}else {
					num=num>>1;
					num=num|check2;
				}
			}else {
				if((num&1)==0) {
					num=num>>1;
					num=num&check1;
				}else {
					num=num>>1;
				}
			}
		}
		System.out.println("n-bit circular : "+Integer.toBinaryString(num));
		String answer ="";
		return answer;
	}

}
