package myproject;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i = i + 1;

		}

		// switch...case
		int x = 5;
		switch (x) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default: // 其餘的用default
			System.out.println("錯誤");

		}
	}
}
