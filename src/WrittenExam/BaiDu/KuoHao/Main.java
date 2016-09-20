package WrittenExam.BaiDu.KuoHao;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		System.out.println(BalancedParentheses(""));
	}

	private static int BalancedParentheses(String str) {
		if (str.charAt(0) == ')')
			return -1;
		Stack<Character> stack = new Stack<>();
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else {
				if (stack.isEmpty())
					return -1;
				stack.pop();
				num++;
			}
		}
		if (stack.isEmpty()) {
			return num;
		} else {
			return -1;
		}
	}
}
