package myproject;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		while (n != 0) {
			System.out.println("請使用者輸入方向2 4 8 6");

			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			int i = n;

			switch (i) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 0:
				System.out.println("See you next time");

			}

		}

	}
}
