package myproject;

import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		System.out.println("請使用者輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int a = 1; a <= n; a++) {
			for (int i = 1; i <= a; i++) {
				System.out.print("*");
			}
			for (int u = 1; u <= (n - a); u++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
