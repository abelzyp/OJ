package CodingInterviews.Q57;

/*
 * 删除链表中重复的结点
 * 		在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 		重复的结点不保留，返回链表头指针。
 * 		例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null)
			return null;
		// 设置一个在pHead之前的头作为最后返回的头
		ListNode head = new ListNode(0);
		head.next = pHead;
		ListNode p = pHead;
		ListNode last = head;
		while (p != null && p.next != null) {
			if (p.val == p.next.val) {
				int v = p.val;
				while (p != null && p.val == v) {
					p = p.next;
				}
				last.next = p;
			} else {
				last = p;
				p = p.next;
			}
		}
		return head.next;
	}
}
