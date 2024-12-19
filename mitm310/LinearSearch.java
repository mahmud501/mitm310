package mitm310;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] agrs) {
		System.out.println("Enter the value to search: ");
		Scanner sc = new Scanner(System.in);
		int[] LA = { 2, 4, 5, 1, 7, 9, 0, 10, 11, 45 };
		int n = LA.length;
		// taking 5 input if data not found
		for (int j = 0; j < 5; j++) {
			int value = sc.nextInt();
			int i = LSearch(LA, n, value);
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

	public static int LSearch(int[] array, int n, int value) {
		int j = 0;
		for (j = 0; j < n; j++) {
			if (array[j] == value) {
				return j;
			}
		}
		return -1;
	}
}
