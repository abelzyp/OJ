package CodingInterviews.Q24;

public class Solution1 {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		return judge(sequence, 0, sequence.length - 1);
	}

	private boolean judge(int[] sequence, int left, int right) {
		if (left >= right)
			return true;
		int i = left;
		while (i < right && sequence[i] < sequence[right])
			i++;
		for (int j = i; j < right; j++) {
			if (sequence[j] < sequence[right])
				return false;
		}
		return judge(sequence, 0, i - 1) && judge(sequence, i, right - 1);
	}
}
