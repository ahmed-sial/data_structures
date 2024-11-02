import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
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
		// As binary search works when the data is sorted, so first sort the array
		insertionSort(array);
		System.out.printf("After sorting: ");
		// The array is printed after sorting
		System.out.println(Arrays.toString(array));
		// Asking the element to search
		System.out.print("Enter the number you want to search: ");
		int toFind = scanner.nextInt();
		int key = binarySearch(array, toFind);
		if (key == -1) {
			// if element is not found then show this message
			System.out.println("Element not found!");
		} else {
			// if element is found then print it's zero-based index
			System.out.printf("%s%d%n", "Index: ", key);
		}
		scanner.close();
	}
	// Binary Search for ascending ordered data set
	// Time Complexity: O(log(n))
	// Space Complexity: O(1)
	public static int binarySearch(int[] array, int toFind) {
		int start = 0, end = array.length - 1;
		while (start <= end) {
			int middle = start + ((end - start) / 2); // this can also be written as "int middle = (start + end) / 2", but this can give integer overflow error
			if (array[middle] == toFind) {
				// if the element is found then return index
				return middle;
			} else if (array[middle] < toFind) {
				// if toFind is greater than current array element then it is definitely on right side so moving start to next index
				start = start + 1;
			} else {
				// if toFind is less than current array element then it is definitely on left side so moving end to previous index
				end = end - 1;
			}
		}
		// if not found then return -1
		return -1;
	}
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (array[j] < array[j - 1]) { 
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}
}
