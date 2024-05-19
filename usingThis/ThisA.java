package usingThis;

import java.util.Scanner;

public class ThisA {
	int a;
	int b;
	void add(int x,int y) {
		a=x;
		b=y;
		System.out.println("addition :"+(a+b));
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two value for addition :");
	int x=sc.nextInt();
	int y=sc.nextInt();
	ThisA a1 =new ThisA();
	a1.add(x, y);
}
}
