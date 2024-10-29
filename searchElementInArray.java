/**
 *	A brute force approach used to search specific element in array. If the element is found return is zero-based index and display it otherwise return -1. 
 */ 
import java.util.Scanner;
public class searchElementInArray {
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
		System.out.print("Enter the number to search: ");
		int toFind = scanner.nextInt();
		int result = searchElement(array, toFind);
		if (result == -1) {
			System.out.println("Element not found!");
		} else {
			System.out.println("Element present at: " + result);
		}
		scanner.close();
	}
	public static int searchElement(int[] array, int toFind) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == toFind) {
				return i;
			} else {
				continue;
			}
		}
		return -1;
	}
}
