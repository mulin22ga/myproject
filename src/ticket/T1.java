package ticket;

public class T1 {
	String date;
	String traintime;
	String go;
	String get;
	int money;

	public T1(String date, String traintime, String go, String get, int money) {
		this.date = date;
		this.traintime = traintime;
		this.go = go;
		this.get = get;
		this.money = money;
	}

	public void print() {
		System.out.println(date + "\t" + traintime + "\t" + go + "\t" + get +"\t"+ money);
	}

}
