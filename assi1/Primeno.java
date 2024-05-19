package assi1;

public class Primeno {
	
public static void main(String Args[]) {
	int n=100;
	int flag=0;
	for(int i=2;i<100;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=1;
						
			}
			
		}
		if(flag==0) {
			System.out.println(i+" is prime number");
		}
		flag=0;
	}
}
}