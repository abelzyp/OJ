package CodingInterviews.Q04_ReplaceBlank;

/*
 * 替换空格
 */
public class Solution {
	public static String replaceBlank(StringBuffer str) {
		int len = str.length();
		int spaceNum = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int newLen = len + 2 * spaceNum;
		str.setLength(newLen);
		int p1 = len - 1;// 指向原先字符串
		int p2 = newLen - 1;// 指向新字符串
		for (; p1 >= 0; p1--) {
			if (str.charAt(p1) != ' ') {
				str.setCharAt(p2--, str.charAt(p1));
			} else {
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We are happy.");
		System.out.println(Solution.replaceBlank(str));
	}
}
