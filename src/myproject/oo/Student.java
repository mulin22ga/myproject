package myproject.oo;

public class Student {
	// private代表他只能在myproject.oo使用
	// 比public範圍小
	// protected可用於繼承的(Student)也可在同類別使用
	int english;
	protected int math;
	int chinese;
	String name;

	static int pass = 60;

	// static類別層級
	public Student() {

	}

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		// 加this變成上面藍色的，不加是灰色的
	}

	public Student(String name) {
		this.name = name;// 對應第七行 輸入這個可以把6變成7
	}

	public static void method() {
		System.out.println("hello");
	}

	public void print() {
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese + "\t");
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}

}
