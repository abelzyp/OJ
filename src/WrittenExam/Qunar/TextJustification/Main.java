package WrittenExam.Qunar.TextJustification;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 输入：
 * 		Our world is but a small part of the cosmos.
 * 输出：
 * 		9
 * 
 * 注：此题不是正解，只是把字符串分割了，后面的还没做完。
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int maxChNum = sc.nextInt();
		char[] chs = sentence.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		int start = 0;
		while (start < sentence.length()) {
			String subStr = "";
			if (start + maxChNum >= sentence.length()) {
				subStr = sentence.substring(start, sentence.length());
				list.add(subStr);
				break;
			} else {
				subStr = sentence.substring(start, start + maxChNum);
			}
			if (sentence.charAt(start + maxChNum) != ' ' && sentence.charAt(start + maxChNum - 1) != ' ') {
				String subSubStr = subStr.substring(0, subStr.lastIndexOf(' '));
				start = start + subSubStr.length() + 1;
				list.add(subSubStr);
			} else {
				list.add(subStr);
				if (sentence.charAt(start + maxChNum) != ' ') {
					start = start + subStr.length() + 1;
				} else {
					start = start + subStr.length();
				}
			}
		}
		for (String s : list) {
			System.out.println(s);
		}
	}
}
