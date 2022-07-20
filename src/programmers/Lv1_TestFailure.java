package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_TestFailure {
	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		int[] answ = Winner(answers);
		
		System.out.println(Arrays.toString(answ));
	}
	static int[] Winner(int[] answers) {
		int[] firstman = {1, 2, 3, 4, 5};
		int[] secondman= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] thirdman = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int answLeng = answers.length; 
		int[] scores = new int[3];
		ArrayList winnerArray = new ArrayList();
		
		for (int i = 0; i < answers.length; i++) {
			int ans = answers[i];
			int iforFirst = firstman.length;
			int iforSecond = ans % secondman.length-1;
			int iforThird = ans % thirdman.length-1;
			System.out.println("f : "+iforFirst+", s : "+iforSecond+", t: "+iforThird);
			if (firstman[iforFirst] == ans) scores[0] = scores[0]+1;
			if(secondman[iforSecond] ==ans) scores[1] = scores[1]+1;
			if(thirdman[iforThird]==ans) scores[2] += 1;
		}
		System.out.println("1: "+Arrays.toString(scores));
		int maxScore=0;
		for (int i:scores) maxScore = Math.max(i, maxScore);
		for (int i=0 ;i<3;i++) {
			if (scores[i]==maxScore) { 
				winnerArray.add(i+1);
				System.out.println("save : "+(i+1));
			}
		}
		
		int leng2 = winnerArray.size();
		int[] winner = new int[leng2];
		System.out.println("leng"+leng2);
		for (int i = 0; i < leng2; i++) {
			System.out.println("will put"+(int)winnerArray.get(i));
		}
		
		for (int i =0;i<(leng2);i++) {
			winner[i]= (int)winnerArray.get(i);
			System.out.println("4: "+winnerArray.get(i));
		}
		return winner;
		
	}
}
