package selfstudy.JavaBase;

import java.util.Arrays;

public class Solution {

    public int solution(int[] nums) {
    	int[] input = nums; //배열 받아와 input 변수에 저장
//    	System.out.println(Arrays.toString(input));
    	Arrays.sort(input); // 배열 정렬
//    	System.out.println(Arrays.toString(input));
    	
    	//소수리스트 만들기(최대값까지)
    	//깃 보내고싶은데
    	int leng = input.length-1;
//    	System.out.println(leng);
    	int maxi = input[leng]+input[leng-1]+input[leng-2];
//    	System.out.println(maxi);
    	int[] sosu = {2, 3, 5, 7};
    	if (sosu[sosu.length-1]<maxi) {
    		for (int i = 1; sosu[sosu.length-1]>=maxi; i++) {
			}
    	}
    	
    	
        int answer = -1;
        
        return answer;
    }

}
