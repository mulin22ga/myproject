package hw2;

public class A {

	public static void main(String args[]) {
		System.out.println("7!=" + fac(7));

	}

	private static int fac(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * fac(i - 1);
		}
	}

}
