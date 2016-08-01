package CodingInterviews.Q05;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 从尾到头打印链表
 */
public class Solution {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		System.out.println(Solution.printListFromTailToHead(listNode1));
	}
}
