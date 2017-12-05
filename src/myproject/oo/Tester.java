package myproject.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student("唉呦", 55, 66, 77);
		// stu.english=55;
		// stu.math=66;
		// stu.chinese=77;
		stu.print();
		int avg = stu.getAverage();
		// System.out.println("唉呦"+avg);
		System.out.print(stu.name + ":" + avg);
	}

}
