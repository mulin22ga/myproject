package myproject.sogo;

public class SilverCustomer extends Customer {
	float discount = 0.1f;

	public SilverCustomer(int amount) {
		super(amount);
		// super.discount = 0.1f;這樣打就不用打@Override
	}

	@Override
	public void print() {
		int total = (int) (amount * (1 - discount));
		System.out.println(amount + "\t" + total);
	}
}
