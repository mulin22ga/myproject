package myproject.oo;

public class GraduateStudent extends Student {

	int thesis;

	public GraduateStudent() {
		super();// 只能用在第一行
		System.out.print("HAha");
	}

	@Override // @Override複寫
	public int getAverage() {

		return (english + math + chinese) / 3;
	}

}
