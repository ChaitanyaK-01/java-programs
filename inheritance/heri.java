package inheritance;
class father1{
	String name;
	String sname;
	double property; 
	void accept() {
		name="sham";
		sname="roy";
		property=100000;	
	}
}

class son1 extends father1 {
	String sonname;
	double property1;
	void set() {
		sonname="ram";
		property1=101010;
	}
	void display() {
		System.out.println(sonname+" "+name+" "+sname+" "+(property/2+property1));
	}
}

class son2 extends father1 {
	String sonname;
	double property1;
	void set() {
		sonname="lakhan";
		property1=10020;
	}
	void display() {
		System.out.println(sonname+" "+name+" "+sname+" "+(property/2+property1));
	}
}


public class heri {

	public static void main(String[] args) {
		son1 s1=new son1();
		son2 s2=new son2();
		s1.accept();
		s2.accept();
		s1.set();
		s2.set();
		s1.display();
		s2.display();

	}

}
