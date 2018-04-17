package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.prefs.PreferenceChangeEvent;

import javax.print.attribute.standard.PrinterState;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.println("HaHa\t1\t1000");
		out.flush();
		out.close();

	}

}
