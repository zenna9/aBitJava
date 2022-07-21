package julyForth;

import java.util.Scanner;

public class Time {
	private int day;
	private int hour;
	private int min;
	private int sec;
	
	public static void main(String[] args) {
		Time first_time = new Time(10, 10, 10);
		
		Scanner inp = new Scanner(System.in);
		int hour = inp.nextInt();
		int min = inp.nextInt();
		int sec = inp.nextInt();
		inp.close();
		Time second_time = new Time(hour, min, sec);
		Time add_time = first_time.add(second_time);
		System.out.println("add_time is :");
		add_time.print_time();
		System.out.println();
		
		Time sub_time = first_time.sub(second_time);
		System.out.println("sub_time is");
		sub_time.print_time();
	}
	
	public Time(int hour, int min, int sec) {
		if(hour>=60||hour<0||min>=60||min<0||sec>=60||sec<0) {
			System.out.println("0부터 59 사이의 값을 입력해야 합니다");
			System.exit(0);
		}
		this.day = 0;
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public Time(int day, int hour, int min, int sec) {
		if(hour>=60||hour<0||min>=60||min<0||sec>=60||sec<0) {
			System.out.println("you need to put a number bigger or same than 0, smaller than 60");
			System.exit(0);
		}
		this.day=day;
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	public Time add(Time second_time){
		int firstSec = this.hour*3600 + this.min*60 + this.sec;
		int secondSec = second_time.hour*(3600) + second_time.min*60 + second_time.sec;
		int addedSec = firstSec+secondSec;
		
		int finalDay = addedSec/(24*3600);
		addedSec = addedSec%(finalDay*24*3600);
		
		int finalHour = addedSec/3600;
		addedSec = addedSec % (finalHour*3600);
		
		int finalMin = addedSec/60;
		addedSec = addedSec %(finalMin*60);
		
		int finalSec = addedSec;
		
		Time answer = new Time(finalDay, finalHour, finalMin, finalSec);
		return answer;
	}
	public Time sub(Time second_time){
		int firstSec = this.hour*(3600) + this.min*60 + this.sec;
		int secondSec = second_time.hour*(3600) + second_time.min*60 + second_time.sec;
		int subSec = firstSec-secondSec;
		int finalDay=0;
		int finalHour=0;
		int finalMin=0;
		int finalSec =0;
		
		while (subSec<0) {
			subSec += 24*3600;
			finalDay -= 1;
		}
		finalHour = subSec/3600;
		subSec = subSec%(finalHour*3600);
		finalMin = subSec/60;
		subSec = subSec%(finalMin*60);
		finalSec = subSec;

		Time answer = new Time(finalDay, finalHour, finalMin, finalSec);
		return answer;
	}
	public void print_time() {
		if (this.day<0) {
			System.out.print(this.day*(-1)+" days ago ");
		}else if(this.day>0) {
			System.out.print(this.day +" after days ");
		}
		System.out.println(this.hour+" : "+this.min+" : "+this.sec);
	}
	public int compare(Time fist_time,Time second_time) {
		int firstSec = this.hour*(3600) + this.min*60 + this.sec;
		int secondSec = second_time.hour*(3600) + second_time.min*60 + second_time.sec;
		int comparedSec = firstSec-secondSec;
		return comparedSec;
	}
	
}
