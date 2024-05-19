package interfacess;
interface A{
	void show();
}
class B implements A{
	public void show() {
		System.out.println("hey coders");
	}
	
}
public class FuncInterface {

	public static void main(String[] args) {
		B b1=new B();
		b1.show();
		

	}

}
