package main3;

import java.util.Scanner;

public class Selected {

	private Scanner scan;
	
	public Selected() {
		
		scan = new Scanner(System.in);
		
		System.out.println("[menu] 1: 検索 2: 登録 3: 再入場 4: 退場 5: 登録内容消去");
		int nums = scan.nextInt();
		
		// switch in switch
		switch(nums) {
		case 1:
			System.out.print("何が知りたい？");
		break;
		case 2:
			System.out.print("登録ありがとう！");
		break;
		case 3:
			System.out.print("おかえり！！");
		break;
		case 4:
			System.out.print("またね！");
		break;
		case 5:
			System.out.print("本当にアカウントを消しますか？");
			System.out.println(" 1: はい or 2: いいえ");
			
			int nums1 = scan.nextInt();
			switch(nums1) {
			case 1:
				System.out.println("残念またね！");
			break;
			case 2:
				System.out.println("ありがとう。楽しんで！");
			break;
			}
		break;
		}
	}
}
