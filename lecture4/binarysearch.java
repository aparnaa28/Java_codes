package lecture4;

import java.util.Scanner;

public class binarysearch {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int a[], index;
		a = Takeinput();
		System.out.println("Enter the element to be searched");
		int num = scn.nextInt();
		index = binarysearch(a, num);
		System.out.println("The element is found at" + index);
	}

	public static int[] Takeinput() {
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static int binarysearch(int arr[], int e) {
		int high = arr.length - 1;
		int low = 0;
		int mid;
		while (low <= high) {
			mid = (high + low) / 2;
			if (e > arr[mid]) {
				low = mid + 1;
			} else if (e < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}
}
