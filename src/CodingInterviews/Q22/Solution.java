package CodingInterviews.Q22;

import java.util.Stack;

/*
 * 栈的压人、弹出序列
 */
public class Solution {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0)
			return false;
		Stack<Integer> dataStack = new Stack<Integer>();
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			dataStack.push(pushA[i]);
			while (!dataStack.isEmpty() && dataStack.peek() == popA[popIndex]) {
				dataStack.pop();
				popIndex++;
			}
		}
		return dataStack.empty();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 5, 3, 2, 1 };
		System.out.println(solution.IsPopOrder(pushA, popA));
	}
}
