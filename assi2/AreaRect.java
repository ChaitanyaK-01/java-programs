package assi2;

import java.util.Scanner;

public class AreaRect {
	int area;
	int length;
	int width;
	Scanner sc =new Scanner(System.in);
	void getLW() {
		System.out.println("enter length and width");
		length=sc.nextInt();
		width=sc.nextInt();
	}
	void area(){
		area=length*width;
		System.out.println("area of rectangle is"+area);
	}

	public static void main(String[] args) {
		AreaRect a=new AreaRect();
		a.getLW();
		a.area();

	}

}
