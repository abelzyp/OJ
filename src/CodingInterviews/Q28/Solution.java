package CodingInterviews.Q28;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 字符串的排列
 */
public class Solution {
	ArrayList<String> strList = new ArrayList<String>();

	public ArrayList<String> Permutation(String str) {
		if (str == null || str.length() == 0)
			return strList;
		Permutation(str.toCharArray(), 0);
		Collections.sort(strList);
		return strList;
	}

	private void Permutation(char[] chs, int i) {
		if (i == chs.length - 1) {
			String result = new String(chs);
			if (!strList.contains(result)) {
				strList.add(result);
			}
		}
		for (int j = i; j < chs.length; j++) {
			char temp = chs[j];
			chs[j] = chs[i];
			chs[i] = temp;
			Permutation(chs, i + 1);
			// 复位
			temp = chs[j];
			chs[j] = chs[i];
			chs[i] = temp;
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.Permutation("abc"));
	}
}
