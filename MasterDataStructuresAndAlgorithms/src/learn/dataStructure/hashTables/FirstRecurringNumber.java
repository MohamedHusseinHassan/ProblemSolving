package learn.dataStructure.hashTables;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringNumber {

	public static void main(String[] args) {

		int[] array = { 2, 5, 5, 2, 3, 5, 1, 2, 4, 6 };

		// int firstRecurringNumber = findFirstRecurringNumberFirstSolution(array);
		int firstRecurringNumber = findFirstRecurringNumberSecondSolution(array);

		System.out.println(firstRecurringNumber);

	}

	// O(n^2) Solution
	private static int findFirstRecurringNumberFirstSolution(int[] array) {

		int firstRecurringNumber = -1;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					firstRecurringNumber = array[i];
					return firstRecurringNumber;
				}

				// special case that found two neighbour elements equal to each other
				if (array[j] == array[j + 1] && (j < array.length - 1)) {
					firstRecurringNumber = array[j];
					return firstRecurringNumber;
				}
			}
		}

		return firstRecurringNumber;
	}

	// O(n) Solution
	private static int findFirstRecurringNumberSecondSolution(int[] array) {

		Map<Integer, Integer> recurringCount = new HashMap();

		int firstRecurringNumber = -1;

		for (int i = 0; i < array.length; i++) {

			if (!recurringCount.containsKey(array[i])) {
				recurringCount.put(array[i], 1);
			} else {
				firstRecurringNumber = array[i];
				return firstRecurringNumber;
			}
		}

		return firstRecurringNumber;
	}

}
