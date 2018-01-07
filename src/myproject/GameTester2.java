package myproject;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class GameTester2 {

	public static void main(String[] args) {
		int pos = 0;
		int hp = 100;
		int row = 3;
		int col = 5;
		Scanner scanner = new Scanner(System.in);
		int d = 100;
		while (d != 0) {
			System.out.println("目前位置" + pos + "HP:" + hp);
			System.out.print("請輸入方向");
			String dir = scanner.nextLine();
			d = Integer.parseInt(dir);
			switch (d) {
			case 2:
				System.out.println("向下");
				if (pos / col < row - 1) {
					pos = pos + col;
					hp = hp - 5;

				} else {
					hp = hp - 30;
				}
				break;
			case 4:
				System.out.println("向左");
				if (pos % col != 0) {
					pos = pos - 1;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				break;
			case 6:
				System.out.println("向右");
				if (pos % col != col - 1) {
					pos = pos + 1;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				break;
			case 8:
				System.out.println("向上");
				if (pos / col > 0) {
					pos = pos - col;
					hp = hp - 5;
				} else {
					hp = hp - 30;

				}
				break;
			case 0:
				System.out.println("Bye");
				break;
			}

		}

	}
}
