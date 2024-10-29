import java.util.Scanner;
public class findMinElementFromArray {
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
			int minimumValue = minElementInArray(array);
			System.out.println("Minimum value: " + minimumValue);
			scanner.close();
	}
	public static int minElementInArray(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			} else {
				continue;
			}
		}
		return min;
	}
}
