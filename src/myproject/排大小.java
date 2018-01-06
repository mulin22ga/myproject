package myproject;

public class 排大小 {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
			for (int x=i+1;x<n.length;x++) {
				if (n[i] >= n[x]) {
					int tmp = n[i];
					n[i] = n[x];
					n[x] = tmp;
				}
			}
			System.out.print(n[i]+" ");
		}

	}
}
