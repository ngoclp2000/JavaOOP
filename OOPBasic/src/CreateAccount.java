
public class CreateAccount{
	public static void main(String[] args) {
		Account p1 = new Account("Nam Hai",100000);
		p1.display();
		System.out.println(p1.getName());
		p1.display("Ngoc Trinh",1000000);
	}
}
