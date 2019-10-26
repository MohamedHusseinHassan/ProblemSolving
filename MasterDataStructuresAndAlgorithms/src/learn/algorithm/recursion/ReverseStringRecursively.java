package learn.algorithm.recursion;

public class ReverseStringRecursively {

	public static void main(String[] args) {

		String input = "yoyo mastery";
		String output = reverseString(input);
		
		System.out.println(output);
		
	}

	static String reverseString(String inputString) {

		if (inputString.length() == 1) {
			return inputString;
		}

		return inputString.substring(inputString.length() - 1)
				+ reverseString(inputString.substring(0, inputString.length() - 1));

	}

}
