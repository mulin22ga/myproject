package myproject;

import java.util.Random;

public class VarribleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		float weight = 69.5f;
		char c = 65;
		char c2 = 'Z';
		int i = c2;
		System.out.println(i);
		boolean pass = false;
		System.out.println(!pass);
	    System.out.println(pass);
	    
	    String s = new String("Hello");
	    Random r = new Random();
	    int n1 = r.nextInt(6)+1;
	    int n2 = r.nextInt(6)+1;
	    int n3 = r.nextInt(6)+1;
	    int n4 = r.nextInt(6)+1;
	    System.out.println(3 <= 2);
	    
	    int len = s.length();
	    System.out.println("len:" + len);
	    System.out.println(s.charAt(3));
	    //
	    float f = 5.0f;
	    int x = 5;
	    int y = 3;
	    int z = x%y;//%��X�O���,/��X�O��
	    System.out.println(z);
	    //
	    x++;//x�֥[�]�i�Hx=x+1
	    x--;//x=x-1
	    System.out.println(x>>1);//���k�@��bit
	    x = x+2;
	    x+=2;
	    System.out.println(x+1);
	    System.out.println(x);
        //�r������
        String data = "123";
        int n = Integer.parseInt(data);
        //�����r��
        String mydata = String.valueOf(n);
        

	    
	    
	    
	}

}
