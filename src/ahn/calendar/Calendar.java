package ahn.calendar;

import java.util.Scanner;

public class Calendar {
	//	상수
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};

	//	함수
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public void printSampleCalendar(Calendar cal,int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------------");
		for(int day=1;day<=cal.maxDaysOfMonth(month);day++) {
			System.out.printf("%d\t",day);
			if(day%7 == 0 || day == cal.maxDaysOfMonth(month)) {
				System.out.println("\n");
			}
		}
	}
	
	public void months_while(int times) {
	}
	
	public static void main(String[] args) {	
		
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		String PROMPT = "cal> ";
		
		while(true) {
			System.out.println("월를 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12) {
				continue;
			}
			cal.printSampleCalendar(cal, month);
		}
	
		System.out.println("Bye~");
//		System.out.printf("%d월은 %d일까지 있습니다.\n",month,cal.maxDaysOfMonth(month));
//		cal.printSampleCalendar();
		scanner.close();
	}
}
