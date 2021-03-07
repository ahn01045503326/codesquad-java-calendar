package ahn.calendar;

import java.util.Scanner;

public class Calendar {
	//	상수
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};

	//	함수
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토 일 ");
		System.out.println("----------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public void months_while(int times) {
	}
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");		
		int times = scanner.nextInt();
		System.out.println("월를 입력하세요.");
		
		int [] arr_months = new int [times];
		int i = 0;
		while(i<times) {
			arr_months[i] = scanner.nextInt();
			i++;
		}
		
		for(int j=0;j<times;j++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n",arr_months[j],cal.maxDaysOfMonth(arr_months[j]));
		}
		
		
		System.out.println("Bye~");
//		cal.printSampleCalendar();
		scanner.close();
	}
}
