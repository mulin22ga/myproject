package hw2;

public class H {

	public static void main(String[] args) {
		// 計算陣列中元素的最大值及最小值
	
		// 產生一數列
				int[] number = { 1000, 200, 30, 40, 500, 60, 70, 8, 90, 100 };
				int max = number[0];
				int min = number[0];
				// 求出最大值
				for (int i = 0; i < number.length; i++) {
					if (number[i] > max) {
						max = number[i];
					}
				}
				// 求出最小值
				for (int i = 0; i < number.length; i++) {
					if (number[i] < min) {
						min = number[i];
					}
				}
				// 印出答案
				// 數列
				System.out.print("數列:");
				for (int i = 0; i < number.length; i++) {
					System.out.print(number[i] + " ");
				}
				System.out.println();
				// 最大值
				System.out.println("最大值：" + max);
				// 最小值
				System.out.println("最小值：" + min);
			}
	}


