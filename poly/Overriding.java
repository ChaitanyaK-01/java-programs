package poly;



class father{
	void display() {
		System.out.println("hey hello");
	}
	
}


class son extends father {
	
	void display() {
		super.display();
	}
}
public class Overriding {

	public static void main(String[] args) {
		son s1=new son();
	
		s1.display();

	}

}
