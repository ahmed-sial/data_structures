/**
 * Given a positive integer n, find the nth Fibonacci number.
 * The Fibonacci sequence is a sequence where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1. The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21
 * F(0) = 0, F(1) = 1
 */

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
		scanner.close();
	}
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		int x = 0;
		int y = 1;
		int z = 0;
		while (n != 1) {
			z = x + y;
			x = y;
			y = z;
			n--;
		}
		return z;
	}
}
