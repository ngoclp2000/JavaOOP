import java.util.Scanner;
public class Input_Output {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = keyboard.nextLine();
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("How tall are you(m)?");
		double height = keyboard.nextDouble();
		System.out.println("Mr/Mrs: " + name + "\n" + age + " year(s) old\n" + "His/Her height is: " + height);
		keyboard.close();
	}
}
