/**
 * Insertion Sort
 * This algorithm compares the element with its previous element and swaps the position until reaches correct position
 */
import java.util.Scanner;
public class InsertionSort {
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
		insertionSort(array);
		System.out.println(java.util.Arrays.toString(array));
		scanner.close();
	}
	// Ascending Order
	// Time Complexity: O(n^2)
	// Space Complexity: O(1)
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {	// Outer loop counts to total iterations which is n - 1 (n = length of array)
			for (int j = i + 1; j > 0; j--) {						// Compares the next element after array[i] and compare upto start of the array
				if (array[j] < array[j - 1]) {						// if smaller element is found then swap it, until it reaches it correct position
					// swapping
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {
					break;																	// else break from inner loop and the current element is in correct position.
				}
			}
		}
	}
}
