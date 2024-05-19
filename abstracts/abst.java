package abstracts;

abstract class phone{
	void call() {
		System.out.println("calling the call method ");
	}
	abstract void song(); 
}
 abstract class nokia extends phone{
	void song() {
		System.out.println("calling song method");
	}
	abstract void display();
}
 class apple extends nokia{
	 void display() {
		 System.out.println("display method");
		 
	 }
	 protected void finalize() {
		 System.out.println("memory robuted");
	 }
 }

public class abst {
	
	public static void main(String[] args) {
		apple a1=new apple();
		a1.call();
		a1.song();
		a1.display();
		phone p1=new apple();
		p1.call();
		p1.song();
		phone p2=new apple();
		phone p3=new apple();
		phone p4=new apple();
		p1=p2;
		p3=p1;//dynamic memory dispatch
		
		System.gc();
	}

}
