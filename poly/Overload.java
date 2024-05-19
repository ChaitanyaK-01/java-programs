package poly;


class parent {
	
	void name(){
		System.out.println("simple name");
	}
	void name(String name) {
		System.out.println("my name is "+name);
		
	}
}
public class Overload {

	public static void main(String[] args) {
		parent p1=new parent();
		p1.name();
		parent p2=new parent();
		String name ="chaitanya";
		p2.name(name);

	}

}
