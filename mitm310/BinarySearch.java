package mitm310;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] agrs) {
		System.out.println("Enter the value to search: ");
		Scanner sc = new Scanner(System.in);
		int[] LA = { 1, 2, 4, 6, 8, 9, 10, 13, 14, 16, 19, 21, 40, 45, 56 };
		int n = LA.length;
		// taking 5 input if data not found
		for (int j = 0; j < 5; j++) {
			int value = sc.nextInt();
			int i = BSearch(LA, 0, n - 1, value);
			if (i == -1) {
				System.out.println("Value not found. Please try with another value");
				System.out.println("Enter the value to search: ");
			} else {
				System.out.println(value + " found at index: " + i);
				System.out.println("Thanks program ends");
				break;
			}
		}
		sc.close();
	}

	public static int BSearch(int[] array, int first, int last, int value) {
		if (first <= last) {
			int mid = (first + last) / 2;
			if (array[mid] == value) {
				return mid;
			} else if (value > array[mid]) {
				return BSearch(array, mid + 1, last, value);
			} else {
				return BSearch(array, first, mid - 1, value);
			}
		}
		return -1;
	}
}