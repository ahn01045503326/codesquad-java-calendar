package ahn.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void rumPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		
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
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,cal.maxDaysOfMonth(month));

		}
	}
	
	public static void main(String[] args) {	
		Prompt p = new Prompt();
		p.rumPrompt();

	}
}
