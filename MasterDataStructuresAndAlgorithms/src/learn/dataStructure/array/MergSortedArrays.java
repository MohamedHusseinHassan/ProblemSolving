package learn.dataStructure.array;

public class MergSortedArrays {

	public static void main(String[] args) {

		int[] firstArray = { 1, 4, 5, 6, 7, 8, 9 };
		int[] secondArray = { 2, 3, 10, 11 };

		merge(firstArray, secondArray);

	}

	private static void merge(int[] firstArray, int[] secondArray) {

		int outputArraySize = firstArray.length + secondArray.length;

		int[] outputArray = new int[outputArraySize];

		int i = 0, j = 0;

		int k = 0;

		while (i < firstArray.length && j < secondArray.length) {

			if (firstArray[i] <= secondArray[j]) {
				outputArray[k] = firstArray[i];
				i++;
			} else if (firstArray[i] >= secondArray[j]) {
				outputArray[k] = secondArray[j];
				j++;
			}

			k++;

		}

		// Copy the remaining element in first array
		while (i < firstArray.length) {
			outputArray[k] = firstArray[i];
			i++;
			k++;
		}

		// Copy the remaining element in second array
		while (j < secondArray.length) {
			outputArray[k] = secondArray[j];
			j++;
			k++;
		}

		for (int n = 0; n < outputArray.length; n++) {
			System.out.print(outputArray[n] + " ");
		}

	}
}
