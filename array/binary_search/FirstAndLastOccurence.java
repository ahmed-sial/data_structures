/**
 * Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
 * Note: If the number x is not found in the array then return both the indices as -1.
 * x = toFind.
 * Two approaches used one is using binary searching and other is brute force.
 */
public class FirstAndLastOccurence {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		System.out.print("Enter the array(sorted): ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the number to find: ");
		int toFind = scanner.nextInt();
		int[] result =	firstAndLastPositionInSortedArray_BinarySearch(array, toFind);
		System.out.println(java.util.Arrays.toString(result));
	}
	public static int[] firstAndLastPositionInSortedArray_BinarySearch(int[] array, int toFind) {
		int firstPosition = -1, start = 0, end = array.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (array[middle] == toFind) {
				firstPosition = middle;
				end = middle - 1;
			} else if (array[middle] < toFind) {
				start = start + 1;
			} else {
				end = end - 1;
			}
		}
		if (firstPosition == -1) {
			return new int[] {-1, -1};
		}
		int lastPosition = -1;
		start = 0;
		end = array.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (array[middle] == toFind) {
				lastPosition = middle;
				start = middle + 1;
			} else if (array[middle] < toFind) {
				start = start + 1;
			} else {
				end = end - 1;
			}
		}
		return new int[] {firstPosition, lastPosition};
	}
	public static int[] firstAndLastPositionInSortedArray_BruteForce(int[] array, int toFind) {
		int firstPosition = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == toFind) {
				firstPosition = i;
				break;
			}
		}
		if (firstPosition == -1) {
			return new int[] {-1, -1};
		}
		int lastPosition = -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == toFind) {
				lastPosition = i;
				break;
			}
		}
		return new int[] {firstPosition, lastPosition};
	}
}
