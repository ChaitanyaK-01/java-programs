package assi1;

import java.io.*;

public class perfectornot {
static int sum=0;
	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int num=Integer.parseInt(br.readLine());
		System.out.println(num);
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
			}
		if(sum==num) {
			System.out.println(sum+" is a perfect number");
		}
		else {
			System.out.println("its not perfect number");
		}
			
	}

}