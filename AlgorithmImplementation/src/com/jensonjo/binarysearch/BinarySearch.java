package com.jensonjo.binarysearch;

public class BinarySearch {
	public int binarySearch(int[] arr, int l, int r, int searchElement) {
		if (r > 0) {
			int mid = l + (r - l) / 2;
			// If the element is present at the middle itself
			if (arr[mid] == searchElement)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > searchElement)
				return binarySearch(arr, l, mid - 1, searchElement);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, r, searchElement);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int len = arr.length;
		int searchElement = 10;
		BinarySearch search = new BinarySearch();
		System.out.println(search.binarySearch(arr, 0, arr.length - 1, searchElement));
	}

}
