package myproject.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;

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

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese + "\t");
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}

}
