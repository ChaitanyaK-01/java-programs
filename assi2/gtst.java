package assi2;

import java.util.Scanner;

public class gtst {
	Scanner sc = new Scanner(System.in);
int n;
int bid[]=new int[100];
String bname[]=new String[100];
double bamount[]=new double[100];

	void getdata() {
		System.out.println("enter how many clints");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter id,name &amount");
			bid[i]=sc.nextInt();
			bname[i]=sc.next();
			bamount[i]=sc.nextDouble();
			
		}
		
	}
	void putdata() {
		System.out.println("details of hdfc bank");
		
		for(int i=0;i<n;i++) {
			
			System.out.println(bid[i]+"\t"+bname[i]+"\t"+bamount[i]);
		}
	}
	public static void main(String[] args) {
		gtst a1=new gtst();
		a1.getdata();
		a1.putdata();
		

	}

}
