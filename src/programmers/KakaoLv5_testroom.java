package programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class KakaoLv5_testroom {

	public static void main(String[] args) {
		int[] num = {12, 30, 1, 8, 8, 6, 20, 7, 5};
		int k = 2;
		int[][] links = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {8, 5}, {2, 10}, {3, 0}, {6, 1}, {11, -1}, {7, 4}, {-1, -1}, {-1, -1}};
		
		int sum = 0;
		for (int i : num) {sum += i;}
		System.out.println("sum : "+sum);
		int avg = sum/(k+1);
		System.out.println("avg : "+avg);
		int max = 0;
		for (int i : num) {max = Math.max(max, i);}
		System.out.println(max);
		
	}

}
