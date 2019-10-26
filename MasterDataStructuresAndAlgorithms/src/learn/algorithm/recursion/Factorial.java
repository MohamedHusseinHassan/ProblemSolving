package learn.algorithm.recursion;

public class Factorial {

	public static void main(String[] args) {

		int output = findFactorialIterative(5);
		System.out.println(output);

		// int output = findFactorialRecursive(5);
		// System.out.println(output);
		//
	}

	static int findFactorialIterative(int input) {

		int output = 1;

		for (int i = input; i > 1; i--) {

			System.out.println("Index is : " + i);

			output = output * i;
		}

		return output;
	}

	static int findFactorialRecursive(int input) {

		if (input == 1) {
			return 1;
		}

		return input * findFactorialRecursive(input - 1);
	}

}
