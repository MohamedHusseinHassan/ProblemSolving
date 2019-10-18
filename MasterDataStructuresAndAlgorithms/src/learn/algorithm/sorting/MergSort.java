package learn.algorithm.sorting;

public class MergSort {

	public static void main(String[] args) {

		
		int input[] = { 4, 7, 14, 1, 3, 9, 17 };

		int leftIndex = 0; // left pointer
		int rightIndex = input.length - 1; // right pointer

		sort(input, leftIndex, rightIndex);

		System.out.println("Sorted array :");
		printArray(input);
	}

	static void printArray(int input[]) {
		int n = input.length;
		for (int i = 0; i < n; ++i)
			System.out.print(input[i] + " ");
		System.out.println();
	}

	public static void sort(int input[], int leftIndex, int rightIndex) {

		// System.out.println("splitting left right: " + leftIndex + " " +
		// rightIndex);

		if (leftIndex < rightIndex) {

			// Find the middle point
			int middleIndex = (leftIndex + rightIndex) / 2;

			// Sort first and second halves
			sort(input, leftIndex, middleIndex);
			sort(input, middleIndex + 1, rightIndex);

			// Merge the sorted halves
			merge(input, leftIndex, middleIndex, rightIndex);

		}

	}

	// Merges two subarrays of array[].
	// First subarray is array[left..middle]
	// Second subarray is array[middle+1..right]
	private static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {

		// Find sizes of two subarrays to be merged
		int leftArraySize = middleIndex - leftIndex + 1; 
		int rightArraySize = rightIndex - middleIndex;

		// Create temp arrays
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		// Copy data to temp arrays
		for (int i = 0; i < leftArraySize; ++i) {
			leftArray[i] = array[leftIndex + i];
		}

		for (int j = 0; j < rightArraySize; ++j) {
			rightArray[j] = array[middleIndex + 1 + j];
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays

		int i = 0, j = 0;

		int k = leftIndex;

		while (i < leftArraySize && j < rightArraySize) {

			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}

			k++;
		}

		/* Copy remaining elements of LeftArray[] if any */
		while (i < leftArraySize) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of RightArray[] if any */
		while (j < rightArraySize) {
			array[k] = rightArray[j];
			j++;
			k++;
		}

		// System.out.println("End \n");

		// printArray(array);

	}

}
