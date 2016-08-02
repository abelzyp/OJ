package CodingInterviews.Q10;

/*
 * 二进制中1的个数
 */
public class Solution {
	public int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) != 0) {
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.NumberOf1(9));
	}
}
