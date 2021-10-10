package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6};
		System.out.print(binarySearch(nums, 0, nums.length - 1, 4));

	}

	private static int binarySearch(int[] nums, int l, int r, int num) {
		if (r >= l) {
			
			int mid = l + (r - l) / 2;
			
			if (nums[mid] == num)
				return mid;
			
			if (nums[mid] > num)
				return binarySearch(nums, l, mid - 1, num);
			
			
			return binarySearch(nums, mid + 1, r, num);
		}

		return -1;
	}

} 
