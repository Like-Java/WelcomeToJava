package main2;

import java.util.Scanner;

public class IfAndSwitch {

	private Scanner scan;
	
	public IfAndSwitch() {
		scan = new Scanner(System.in);
		System.out.println("簡単な占い");
		System.out.println("1から5の好きな数字をえらんでね");
		int fortune = scan.nextInt();
		
		// This is switch form
		switch(fortune) {
		case 1:
		case 2:
			System.out.println("今日は気分が上々だね");
		break;
		case 3:
			System.out.println("今日はまあまあかな");
		break;
		case 4:
			System.out.println("おっと〜！？");
		break;
		case 5:
			System.out.println("今日は大人しくしてた方がいいかも");
		break;
		}
		
	}
}
