package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *二元搜索法，搜索的目標資料必須是已經排序過的。
 *其概念是每次挑選中間位置的資料來比對，若該資料小於目標值，則縮小範圍為左半部，反之亦然
 *因此使用這個方法每次比對後都可以濾掉一半的資料，以增快搜索速度。
 */

public class BinarySearch {

	public static void main(String[] args) {
		// 製造數列
		List<Integer> number = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			number.add(i);
		}
		// 印出數列
		System.out.println("數列：");
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) + "  ");
		}
		System.out.println();
		// 用二元搜尋找出此數
		System.out.println("請輸入要查詢的數：");
		Scanner scanner = new Scanner(System.in);
		int find = scanner.nextInt();
		boolean b = false;
		int pos = 0;
		int left = 0;
		int right = number.size() - 1;
		while (right > left) {
			// 找到了
			if (find == number.get((left + right) / 2)) {
				pos = (left + right) / 2;
				b = true;
				break;
			}
			// 欲找數大於假設數(放棄左邊)
			if (find > number.get((left + right) / 2)) {
				left = ((left + right) / 2) + 1;
			}
			// 欲找數小於假設數(放棄右邊)
			if (find < number.get((left + right) / 2)) {
				right = ((left + right) / 2) - 1;
			}
		}
		// 印出資料
		if (b) {
			System.out.println("找到此數，在位置" + (pos + 1) + "!");
		} else {
			System.out.println("找無此數!");
		}

	}

}