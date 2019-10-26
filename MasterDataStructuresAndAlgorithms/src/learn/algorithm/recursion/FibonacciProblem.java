package learn.algorithm.recursion;

public class FibonacciProblem {

	public static void main(String[] args) {

		// Given a number N return the index value of the Fibonacci sequence,
		// where the sequence is:

		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
		// the pattern of the sequence is that each value is the sum of the 2
		// previous values,
		// that means that for N=5 → 2+3

		// For example: fibonacciRecursive(6) should return 8

		// int output = fibonacciIterative(6);

		int output = fibonacciRecursive(7);

		System.out.println(output);

	}

	static int fibonacciIterative(int input) {

		if (input == 0) {
			return 0;
		}

		if (input == 1 || input == 2) {
			return 1;
		}

		int[] output = new int[input];
		output[0] = 1;
		output[1] = 1;

		for (int i = 2; i < input; i++) {

			output[i] = output[i - 1] + output[i - 2];
		}

		return output[output.length - 1];
	}

	static int fibonacciRecursive(int input) {
		if (input < 2) {
			return input;
		}

		return fibonacciRecursive(input - 1) + fibonacciRecursive(input - 2);
	}

}
