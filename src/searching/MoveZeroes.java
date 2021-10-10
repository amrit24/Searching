package searching;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0 };

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			if (arr[l] == 1 && arr[r] == 0) {
				arr[l++] = 0;
				arr[r--] = 1;
			} else if (arr[l] == 0 && arr[r] == 1) {
				l++;
				r--;
			} else if (arr[l] == 1 && arr[r] == 1) {
				r--;
			} else if (arr[l] == 0 && arr[r] == 0) {
				l++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
