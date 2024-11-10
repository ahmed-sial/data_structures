/**
	Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
	// Time Complexity: O(log n)
	public int searchInsertPositionBinarySearch(int[] array, int target) {
		int start = 0, end = array.length - 1, result = 0;
		while (start <= end) {
			int middle = (start + (end - start) / 2);
			if (array[middle] == target) {
				return middle;
			} else if (array[middle] < target) {
				result = middle + 1;
				start = middle + 1;
			} else {
				result = middle;
				end = middle - 1;
			}
		}
		return result; 
	}
	// Time complexity: O(n)
	public int searchInsertPositionBruteForce(int[] array, int target) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < target) {
				result = i + 1;
			} else if (array[i] == target) {
				result = i;
				break;
			} else {
				break;
			}
		}
		return result;
	}
}
