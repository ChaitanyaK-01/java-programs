package encap;


class bank{
	 private String name;
	 private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "name=" + name + " amount=" + amount ;
	}
	 
	
}
public class getset {

	public static void main(String[] args) {
	bank b1 = new bank();
	b1.setName("aman");
	System.out.println(b1.getName());
	b1.setAmount(12345);
	System.out.println(b1.getAmount());
	System.out.println(b1);
	}
    
}
