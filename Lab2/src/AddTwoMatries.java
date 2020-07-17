import java.util.Scanner;
public class AddTwoMatries {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of matrices");
		n = keyboard.nextInt();
		int[] matrix1 = new int[n];
		int[] matrix2 = new int[n];
		System.out.println("Enter the matrix 1: ");
		for(int i = 0 ; i < n ; i++)
			matrix1[i] = keyboard.nextInt();
		System.out.println("Enter the matrix 2: ");
		for(int i= 0 ; i< n ; i++)
			matrix2[i] = keyboard.nextInt();
		int[] matrix3 = new int[n];
		for(int i = 0 ; i < n ; i++)
			matrix3[i] = matrix1[i] + matrix2[i];
		for(int i = 0 ; i < n ; i++)
			System.out.print(matrix3[i]+" ");
		keyboard.close();
	}
}
