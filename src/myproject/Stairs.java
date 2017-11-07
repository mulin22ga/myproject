package myproject;

import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		System.out.println("請使用者輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		for (int n=1; n <=age; n++) {
System.out.println("*");

		}
	}

}
