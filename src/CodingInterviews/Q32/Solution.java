package CodingInterviews.Q32;

/*
 * 从1到n整数中1出现的次数
 */
public class Solution {
	public int NumberOf1Between1AndN_Solution(int n) {
		if (n < 1)
			return 0;
		int len = getLenOfNum(n);
		if (len == 1)
			return 1;
		int tmp = (int) Math.pow(10, len - 1);
		int first = n / tmp;
		int firstOneNum = first == 1 ? n % tmp + 1 : tmp;
		int otherOneNUm = first * (len - 1) * (tmp / 10);
		return firstOneNum + otherOneNUm + NumberOf1Between1AndN_Solution(n % tmp);
	}

	private int getLenOfNum(int n) {
		int len = 0;
		while (n != 0) {
			len++;
			n /= 10;
		}
		return len;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.NumberOf1Between1AndN_Solution(114));
	}
}
