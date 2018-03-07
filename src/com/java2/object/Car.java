package com.java2.object;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		System.out.println("請輸入想購買車種");
		System.out.println("1.Benz");
		System.out.println("2.BMW");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int m = Integer.parseInt(line);
		if (m == 1) {
			Car2 c1 = new Car2(1000);
		}
		if (m == 2) {
			System.out.println("2222");
		}
	}

}
