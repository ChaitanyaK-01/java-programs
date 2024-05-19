package usingThis;

import java.util.Scanner;

public class ThisThis {
	int a;
	int b;
	void add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("addition :"+(a+b));
	}
public static void main(String args[]) {
	
	ThisThis a1 =new ThisThis();
	a1.add(20, 50);
}
}
