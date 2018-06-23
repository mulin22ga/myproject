package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FuleTester {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("data2.txt");
			out.write(65);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		} catch (IOException e) {
			System.out.println("File Output problem");
		}

	}
}
