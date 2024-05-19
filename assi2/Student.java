package assi2;

public class Student {
int roll_num;
String name;
Student(int x,String y){
	this.name=y;
	this.roll_num=x;
	System.out.println("name :"+name+"\t roll nnumber :"+roll_num);
}

	public static void main(String[] args) {
		Student s1=new Student(2,"john");

	}

}
