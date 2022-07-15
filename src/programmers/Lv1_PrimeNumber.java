package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_PrimeNumber {

	public static void main(String[] args) {
		int[] b = { 5, 4, 1, 2, 3 };
		int ans = solution(b);
		System.out.println("answer is " + ans);
		// System.out.println(a.solution({1, 2, 3}));
		// 이건 왜 안돼?
	}

	public static int solution(int[] nums) {
		
		int answer = 0;
		ArrayList<Integer> sumlist = new ArrayList<Integer>();
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int j2 = j+1; j2 < nums.length; j2++) {
					sumlist.add(nums[i]+nums[j]+nums[j2]);
				}
			}
		}
		for (int i : sumlist) {
			System.out.print(i+",");
		}
		System.out.println();
		return answer;
	}
}
