package CodingInterviews.Q07;
/*
 * 用两个栈实现队列
 */

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要入队的元素：");
		int n = sc.nextInt();
		Solution solution = new Solution();
		solution.push(n);
		System.out.println("再输入一个要入队的元素：");
		n = sc.nextInt();
		solution.push(n);
		System.out.println("出队一个元素：" + solution.pop());
		System.out.println("出队一个元素：" + solution.pop());
	}
}
