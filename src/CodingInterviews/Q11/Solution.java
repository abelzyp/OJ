package CodingInterviews.Q11;

/*
 * 数值的整数次方
 */
public class Solution {
	public double Power(double base, int exponent) {
		if (exponent == 0)
			return 1;
		else if (exponent > 0) {
			double res = base;
			for (int i = 1; i < exponent; i++) {
				res *= base;
			}
			return res;
		} else {
			double res = base;
			int flag = -exponent;
			for (int i = 1; i < flag; i++) {
				res *= base;
			}
			return 1 / res;
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.Power(2.13, -5));
	}
}
