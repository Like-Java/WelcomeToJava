package main4;

public class Random {
		
	public Random() {
		
		  int[] solves = new int[10];
		  
		  for(int i = 0; i < solves.length; i++) {
			  System.out.println((int)(Math.random() * (solves.length)));
		  }
		  
	}
}


