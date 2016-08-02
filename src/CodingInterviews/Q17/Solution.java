package CodingInterviews.Q17;

/*
 * 合并两个排序的链表
 */
public class Solution {
	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		else if (list2 == null) {
			return list1;
		}
		ListNode mergeHead = null;
		if (list1.val < list2.val) {
			mergeHead = list1;
			mergeHead.next = Merge(list1.next, list2);
		} else {
			mergeHead = list2;
			mergeHead.next = Merge(list1, list2.next);
		}
		return mergeHead;
	}
}
