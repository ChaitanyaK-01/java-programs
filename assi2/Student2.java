package assi2;

import java.util.Scanner;

public class Student2 {
	int[]  rn=new int[100];
	long[] num=new long[100];
	String addr[]=new String[100];
	String name[]=new String[100];
	int n;
	Scanner sc=new Scanner(System.in);
	void insertdetails() {
		System.out.println("enter how many student");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter details of"+i+" student");
			System.out.println("enter roll number,number,adderess ,and name");
			rn[i]=sc.nextInt();
			num[i]=sc.nextLong();
			addr[i]=sc.next();
			name[i]=sc.next();	
			}
	}
	void display() {
		for(int i=0;i<n;i++) {
			System.out.println(rn[i]+"\t"+name[i]+"\t"+num[i]+"\t"+addr[i]);
		}
	}
public static void main(String args[]) {
	Student2 s=new Student2();
	s.insertdetails();
	s.display();
}
}
