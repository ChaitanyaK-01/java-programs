package interfacess;
interface G{
	void show();
}
public class Annonimous {

	public static void main(String[] args) {
		G g1=new G() {
			public void show() {
				System.out.println("its is displayed by using annonimous class!!");
			}
		};
g1.show();
	}

}
