package CodingInterviews.Q36;

public class SolutionBetter {
	public int InversePairs(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		// 复制出一个数组
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		int count = InversePairsCore(array, copy, 0, array.length - 1);
		return count;
	}

	// 利用归并排序
	private int InversePairsCore(int[] array, int[] copy, int low, int high) {
		if (low == high)
			return 0;
		// 定位中间位置
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
		int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i >= low && j > mid) {
			if (array[i] > array[j]) {
				count += j - mid;
				copy[locCopy--] = array[i--];
				if (count >= 1000000007)
					count %= 1000000007;
			} else {
				copy[locCopy--] = array[j--];
			}
		}
		for (; i >= low; i--)
			copy[locCopy--] = array[i];
		for (; j > mid; j--)
			copy[locCopy--] = array[j];
		for (int s = low; s <= high; s++)
			array[s] = copy[s];
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 7, 5, 6, 4 };
		System.out.println(solution.InversePairs(array));
	}
}
