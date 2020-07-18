 public class Account {
	private String name;
	private long balance;
	static float interest = 1.25f;
	//Constructor
	public Account() {
		this.name = "Undefined";
		this.balance = 0;
	}
	public Account(String iName,long iMoney){
		this.name = iName;
		this.balance = iMoney;
	}
	//Set Data for Account
	public void setData(String name,long money) {
		this.name = name;
		this.balance = money;
	}
	// getName
	public String getName() {
		return this.name;
	}
	// getBalance
	public long getBalance() {
		return this.balance;
	}
	// Display all informations
	void display() {
		System.out.println(this.name + " has " + this.balance +" VND");
	}
	void display(String nName,long nMoney) {
		this.balance = nMoney;
		this.name = nName;
		display();
	}
	// Change the balance
	void deposit(long money) {
		this.balance += money;
	}
	// Display instance method
	void instanceDisplay() {
		System.out.println("The interest of " + this.name + " is: " + interest);
	}
	static void staticDisplay() {
		System.out.println("Deposit rate: " + interest);
	}
	
}