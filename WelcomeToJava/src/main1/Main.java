package main1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
				
			System.out.println("あなたの名前を教えて下さい");
			String name = scan.nextLine();
				
			System.out.println("あなたの年齢を教えて下さい");
			int age = scan.nextInt();
					
			if (age > 20) {
				System.out.println( name + "さんは、 " + age + "歳なので成人ですね");
			} else {
				System.out.println( name + "さんは、 " + age + "歳なのでこれから成長していきますよ");
			}
				
	}
}
