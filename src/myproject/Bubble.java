package myproject;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 55, 6, 31, 77, 13 };
		for (int i = 0; i < n.length ; i++) {
			for (int j = i + 1; j < n.length; j++) {
				System.out.println(i + "," + j);
				if (n[i] > n[j]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;

				}
			}
		}
		for (int num : n) {
			System.out.print(num + " ");
		}
	}

}
