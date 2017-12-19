package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		int i = 100;
		for (i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");

				if (i % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
