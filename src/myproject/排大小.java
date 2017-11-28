package myproject;

public class 排大小 {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
			
			for (int x : n) {
				if (i >= x) {
					int tmp = i;
					i = x;
					x = tmp;
				}
			}
			System.out.println(n[i]);
		}

	}
}
