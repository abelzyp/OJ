package CodingInterviews.Q16;

/*
 * 反转链表，以牛客题为主
 */
public class Solution {
	public ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		// 当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
