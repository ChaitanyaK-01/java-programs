package assi1;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		int number,a,b,c;
		System.out.println(" check for three digit numbers is armstrong or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		a=number/100;
		System.out.println(a);
		b=(number%100)/10;
		System.out.println(b);
		c=(number%10);
		System.out.println(c);
		if(a*a*a+b*b*b+c*c*c==number) {
			System.out.println("number is Armstrong ");
		}
		else {
			System.out.println("number is not armstrong");
		}

	}

}
