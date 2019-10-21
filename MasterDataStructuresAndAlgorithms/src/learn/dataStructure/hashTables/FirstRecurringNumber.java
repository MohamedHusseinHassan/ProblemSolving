package learn.dataStructure.hashTables;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringNumber {

	public static void main(String[] args) {

		int[] array = { 2, 5, 1, 2, 3, 5, 1, 2, 4 };

		int firstRecurringNumber = findFirstRecurringNumber(array);

		System.out.println(firstRecurringNumber);

	}

	private static int findFirstRecurringNumber(int[] array) {

		Map<Integer, Integer> recurringCount = new HashMap();

		int firstRecurringNumber = 0;

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
