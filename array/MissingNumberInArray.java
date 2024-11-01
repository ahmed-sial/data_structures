/**
 * Given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
 * This array represents a permutation of the integers from 1 to n with one element missing. Task is to identify and return the missing element.
 */
import java.util.Scanner;
public class MissingNumberInArray {
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
		System.out.println("Missing number in array: " + missingNumebr(array));
		scanner.close();
	}
	public static int missingNumebr(int[] array) {
		int n = array.length + 1;
		int naturalNumsSum = (n * (n + 1)) / 2;
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		return (naturalNumsSum - arraySum);
	}
}
