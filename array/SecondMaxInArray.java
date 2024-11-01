import java.util.Scanner;
public class SecondMaxInArray {
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
		int result = secondMaximum(array);
		if (result == -1)
			System.out.println("No second maximum!");
		else
			System.out.printf("%s%d%n", "Second Maximum: ", result);
		System.out.println();
		scanner.close();
	}
	public static int secondMaximum(int[] array) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] < max) {
				secondMax = array[i];
			}
		}
		if (secondMax == Integer.MIN_VALUE)
			return -1;
		return secondMax;
	}
}
