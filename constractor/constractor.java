package constractor;
 class xyz{
	 int a;
	 int b;
	 xyz(){
		 System.out.println("default constractor");
		 int a=10;
		 int b=20;
		 System.out.println(a+b);
	 }
	 xyz(int a,int b){
		 this.a=a;
		 this.b=b;
		 System.out.println("default constractor");
		 System.out.print("addition :"+(a+b));
		 
	 }
	 xyz(xyz x1){
		 System.out.println("copy constractor");
		 System.out.println(x1.a+x1.b);
	 }
 }
public class constractor {


	public static void main(String[] args) {
		xyz x1=new xyz();
		new xyz(x1);
		int a=20;
		int b=30;
		new xyz(a,b);

	}

}
