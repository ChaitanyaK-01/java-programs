package assi1;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int number,a,b,c;
		System.out.println("palindrome check for three digit numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		a=number/100;
		System.out.println(a);
		b=(number%100)/10;
		System.out.println(b);
		c=(number%10);
		System.out.println(c);
		if(a==c) {
			System.out.println("number is palindrome ");
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
