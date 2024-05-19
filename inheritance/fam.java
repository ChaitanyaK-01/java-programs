package inheritance;
class father{
	String name;
	String sname;
	double property; 
	void accept() {
		name="sham";
		sname="roy";
		property=100000;	
	}
}

class son extends father {
	String sonname;
	double property1;
	void set() {
		sonname="ram";
		property1=101010;
	}
	void display() {
		System.out.println(sonname+" "+name+" "+sname+" "+(property+property1));
	}
}

public class fam {
public static void main (String args[]) {
	son s1= new son();
	s1.accept();
	s1.set();
	s1.display();
	
}
}
