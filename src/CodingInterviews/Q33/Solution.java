package CodingInterviews.Q33;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 把数组排成最小的数
 * 解题思路：
 * 		先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。关键就是制定排序规则。
 * 		排序规则如下：
 * 			若ab > ba 则 a > b，
 * 			若ab < ba 则 a < b，
 * 			若ab = ba 则 a = b；
 * 解释说明：
 * 		比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
 */
public class Solution {
	public String PrintMinNumber(int[] numbers) {
		if (numbers == null || numbers.length == 0)
			return "";
		int len = numbers.length;
		String[] strs = new String[len];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			strs[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String c1 = str1 + str2;
				String c2 = str2 + str1;
				return c1.compareTo(c2);
			}
		});
		for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = { 3, 32, 321 };
		System.out.println(solution.PrintMinNumber(numbers));
	}
}
