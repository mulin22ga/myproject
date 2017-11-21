package myproject;

public class Continue {

	public static void main(String[] args) {
		/*
		  Please enter a number :13 
		  1 2 3 4 5 6 7 8 9 10 11 12 13 
		  三的倍數不印
		 */
		for (int i = 1; i <= 13; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
	
	
	
	

}
