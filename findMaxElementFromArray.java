import java.util.Scanner;
public class findMaxElementFromArray {
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
			int maxElement = maxElementFromArray(array);
			System.out.println("Maximum value: " + maxElement);
			scanner.close();
	}
	public static int maxElementFromArray(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else {
				continue;
			}
		}
		return max;
	}
}
