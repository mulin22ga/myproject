package myproject;

import java.util.Scanner;

public class 來問問題 {

	public static void main(String[] args) {
		System.out.println("以下誰的年紀最大?");
		System.out.println("(1)周杰倫");
		System.out.println("(2)華晨宇");
		System.out.println("(3)梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 3) {
			System.out.println("你猜錯了廢物");
		} else {
			System.out.println("讚喔對了");

		}
	}
	
}
