import java.util.Scanner;
public class SortArray {
	static void BubbleSort(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of array");
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = keyboard.nextInt();
		BubbleSort(arr);
		for(int i = 0 ; i < n ; i++) System.out.print(arr[i] + " ");
		keyboard.close();
	}
}
