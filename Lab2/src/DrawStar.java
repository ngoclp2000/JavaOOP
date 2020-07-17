import java.util.Scanner;
public class DrawStar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int bottom = 1+(n-1)*2;
		int mid = (bottom+1)/2;
		for(int i = 1 ; i <= n ; i ++) {
			for(int j = 1 ; j <= bottom ; j++) {
				if(j < mid - i + 1 || j > mid + i - 1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");
		}
		keyboard.close();
	}
}
