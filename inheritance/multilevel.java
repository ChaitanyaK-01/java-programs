package inheritance;
class ffather{
	String name;
	String sname;
	double property; 
	void accept() {
		name="sham";
		sname="roy";
		property=100000;	
	}
}

class sson extends father {
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
class grandson extends son{
	String gname;
	double property2;
	void setdata() {
		gname="giridhar";
		property2=1010;
	}
	void displaydata() {
		System.out.println(gname+" "+sonname+" "+name+" "+sname+" "+(property+property1+property2));
	}
}

public class multilevel {

	public static void main(String[] args) {
		grandson g=new grandson();
		g.accept();
		g.set();
		g.display();
		g.setdata();
		g.displaydata();

	}

}
