package com.java2.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		Machine m = new Machine();
		try {
			FileReader fr = new FileReader("vending.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for (int i = 0; i < count; i++) {
				String name = tokens[i * 2 + 1];
				int price = Integer.parseInt(tokens[i * 2 + 2]);
				m.drink.add(new Drink(i + 1, name, price));
			}
			m.no();
		} catch (Exception e) {
			System.out.println("No");
		}
	}

}
