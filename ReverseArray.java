import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s%d%s", "array[", i + 1, "]: ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Reversed Array: ");
		array = reverseArray02(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		scanner.close();
	}
	// Simple approach using extra array.
	// Time complexity :- O(n)
	// Space complexity: - O(n)
	public static int[] reverseArray02(int[] array) {
		int[] reversedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - i - 1];	
		}
		return reversedArray;
	}
	// Better approach without using extra array swapping values in place
	// Time complexity :- O(n)
	// Space complexity: - O(1) 
	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;	
		}
	}
}
