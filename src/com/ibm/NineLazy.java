package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for (int y = 1; y < 10; y++) {
			if (y < 4 | y > 8) {
				for (int x = 2; x < 10; x++) {
					if ((x * y) < 10) {
						System.out.print(x + "x" + y + "=" + " " + (x * y) + "\t");
					} else {
						System.out.print(x + "x" + y + "=" + (x * y) + "\t");
					}
				}
				System.out.println();
			} else {
				System.out.print("..." + "\t" + "..." + "\t" + "..." + "\t" + "..." + "\t" + "..." + "\t" + "..." + "\t"
						+ "..." + "\t" + "...");
				System.out.println();
			}
		}
	}
}