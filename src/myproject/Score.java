package myproject;

public class Score {

	public static void main(String[] args) {
		int score = 100;
		int level = score / 10;// 分數除以十取商
		switch (level) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10:
			System.out.println("Excellent");
			break;
		}
	}

}
