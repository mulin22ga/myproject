package myproject;

public class Prime {

	public static void main(String[] args) {
		int n = 17;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime=false;
				break;
			}
		}
		if (prime) {
			System.out.println(n + "Is prime number!");


		} else {
			System.out.println("Not prime");

		}
	}
}
