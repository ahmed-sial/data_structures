/**
	Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 */
public class SquareRootUsingBinarySearch {
	//Time complexity: O(log n)
	public static int squareRootBinarySearch(int x) {
		if (x < 2) {
			return x;
		}
		int start = 0, end = x, result = 0;
		while (start <= end) {
			int middle = (start + (end - start) / 2);
			if (middle == x / middle) {
				return middle;
			} else if (middle < x / middle) {
				result = middle;
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return result;
	}
}
