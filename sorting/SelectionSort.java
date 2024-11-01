/**
 * Selection Sort Algorithm (Ascending)
 * 1. Select the smallest number from unsorted array.
 * 2. Swap the smallest number with the first element in usorted array.
 * 3. Repeat step 1 and 2 for n - 1 times, where n = length of array
 * Take the following example:
 * array = [2, 5, 6, 1, 3] (To explain, the array in square brackets is unsorted)
 * minimum = 1, first element in unsorted array is 2. So swap them 
 * array = 1, [5, 6, 2, 3] (Now the array inside the brackets is unsorted and outside is sorted)
 * Repeat step 1, 2, 3
 * array = 1, 2, [6, 5, 3]
 * array = 1, 2, 3, [5, 6]
 * array = 1, 2, 3, 5, 6
 * Note the steps are done 4 times whereas the length of array is 5
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
import java.util.Scanner;
public class SelectionSort {
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
		selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		scanner.close();
	}
	// For sorting in ascending order
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) { //outer loop controls the total amount of steps 1 and 2 to be repeated which is one less than size of array
			int min = i; // assume first element of unsorted array to be min.
			for (int j = i + 1; j < array.length; j++) { // inner loop start from next element after i for comparing with array[i]
				if (array[j] < array[min]) {
					min = j; // if the current array[j] is minimum than previously assumed minimum (min = i) then update min
				}
			}
			// swapping the minimum	and first element in unsorted array
			int temp = array[min];		
			array[min] = array[i];
			array[i] = temp;
		}
	}
}
