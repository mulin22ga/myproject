package com.kao;

public class Numb {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

}
