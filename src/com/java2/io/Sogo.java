package com.java2.io;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class Sogo {
	public Sogo() {

	}

	public void star() {
		int function = 0;
		showFunctions();
		Scanner scanner = new Scanner(System.in);
		while (function != 3) {
			function = scanner.nextInt();
			switch (function) {
			case 3:
				return;
			}
		}
	}

	private static void showFunctions() {
		System.out.println("請輸入功能(1~3):");
		System.out.println("1)請輸入銷售紀錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程式");
	}

}
