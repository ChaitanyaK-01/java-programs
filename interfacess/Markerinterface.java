package interfacess;
interface N{
	
}
class D implements N{
	void show() {
		System.out.println("its a marker inteface");
	}
}

public class Markerinterface {

	public static void main(String[] args) {
		D d1=new D();
		if(d1 instanceof N) {
			d1.show();
		}
		else {
			System.out.println("no permission");
			
		}
		
		

	}

}
