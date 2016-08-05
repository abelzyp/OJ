package CodingInterviews.Q34;

/*
 * 丑数
 * 		后面的丑数是前一个丑数乘以2，3，5中的一个得来。因此可以用动态规划去解
 */
public class Solution {
	public int GetUglyNumber_Solution(int index) {
		if (index <= 0)
			return 0;
		int[] ugNum = new int[index];
		ugNum[0] = 1;
		int t2 = 0, t3 = 0, t5 = 0;
		for (int i = 1; i < index; i++) {
			ugNum[i] = Math.min(ugNum[t2] * 2, Math.min(ugNum[t3] * 3, ugNum[t5] * 5));
			if (ugNum[i] == ugNum[t2] * 2)
				t2++;
			if (ugNum[i] == ugNum[t3] * 3)
				t3++;
			if (ugNum[i] == ugNum[t5] * 5)
				t5++;
		}
		return ugNum[index - 1];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.GetUglyNumber_Solution(1500));
	}
}
