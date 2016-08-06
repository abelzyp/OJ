package CodingInterviews.Q42;

import java.util.Stack;

/*
 * 翻转单词顺序
 * 		此方法是用栈存储句子中的每个单词，在逆序加空格输出
 */
public class Solution {
	public String ReverseSentence(String str) {
		if (str == null || str.length() == 0)
			return "";
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			} else {
				stack.push(sb.toString());
				sb = new StringBuilder();
			}
		}
		stack.push(sb.toString());
		sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
			sb.append(" ");
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String str = "I am a student.";
		System.out.println(solution.ReverseSentence(str));
	}
}
