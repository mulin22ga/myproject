package hw2;

import java.util.Scanner;

public class B {
	public static int a;
	public static int b;

	public static void main(String[] args) {
		// 最大公因數

		System.out.print("請輸入兩數A，B：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] tokens = line.split(",");
		a = Integer.parseInt(tokens[0]);
		b = Integer.parseInt(tokens[1]);
		// 輾轉相除法
		while (a != 0 && b != 0) {
			GCD(a, b);
		}
		// 印出答案
		if (a == 0) {
			System.out.println("GCD = " + b);
		} else {
			System.out.println("GCD = " + a);
		}
	}
	public static int GCD(int number1, int number2) {
		if (a > b) {
			a = a - b;
			return a;
		} else {
			b = b - a;
			return b;
		}
	}

}
