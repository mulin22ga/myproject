package myproject.sogo;

public class GoldenCustomer extends SilverCustomer {

	public GoldenCustomer(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		int total = (int) (amount * (1 - discount));
		System.out.println(amount + "\t" + total + "\t" + "紅利金為:" + total);
	}

}
