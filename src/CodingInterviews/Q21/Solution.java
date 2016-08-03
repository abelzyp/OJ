package CodingInterviews.Q21;

import java.util.Stack;

/*
 * 包含min函数的栈
 */
public class Solution {
	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int node) {
		dataStack.push(node);
		if (minStack.size() == 0 || node < minStack.peek())
			minStack.push(node);
		else
			minStack.push(minStack.peek());
	}

	public void pop() {
		dataStack.pop();
		minStack.pop();
	}

	public int top() {
		return dataStack.peek();
	}

	public int min() {
		return minStack.peek();
	}
}
