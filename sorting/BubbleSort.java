/**
 * Bubble Sort
 * Compare the adjacent elements of array, and swap the elements according to desire(ascending or descending).
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BubbleSort {
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
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		scanner.close();
	}
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {// controls the total iteration that will be n - 1 (n = length of array) 
			boolean swapped = false;// used to check if any swap is made. If swap is made then the array is still to be sorted else the array is sorted
			for (int j = 0; j < array.length - i - 1; j++) { // checks from start upto last element of unsorted array. The sorted element moves to end of array
				if (array[j] > array[j + 1]) { // if array[j] is greater then swap until it reaches it's correct position
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;// if swap made then there is chance than array is still unsorted.
				}
			}
			if (swapped == false) // if no swaps then array is sorted to break from the outer loop.
				break;
		}
	}
}
