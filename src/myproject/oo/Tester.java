package myproject.oo;

public class Tester {

	public static void main(String[] args) {
		// Student stu = new Student("唉呦", 55, 66, 77);
		Student stu1 = new Student("唉呦", 55, 66, 74);
		Student stu2 = new Student("唉呦2", 77, 99, 22);
		// stu.english=55;
		// stu.math=66;
		// stu.chinese=77;
		stu1.pass = 50;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		// System.out.println("唉呦"+avg);
		System.out.print(stu1.name + ":" + avg);
		Student.method();
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	}

}
