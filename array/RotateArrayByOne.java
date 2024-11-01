/**
 * Given an array arr, rotate the array by one position in clock-wise direction.
 */
import java.util.Scanner;
public class RotateArrayByOne {
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
		rotateArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		scanner.close();
	}
	public static int[] rotateArray(int[] array) {
		int firstElement = array[array.length - 1];
		for (int i = array.length - 2; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = firstElement;
		return array;
	}
}
