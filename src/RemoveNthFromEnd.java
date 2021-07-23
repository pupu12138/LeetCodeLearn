/**
 * @author WYZ
 * @creat 2021-07-23 11:20
 */
public class RemoveNthFromEnd {
//    本代码为快慢指针解法，我并未提供main方法，
//    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || head.next == null) {
                return null;
            }

            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;

            ListNode slow = dummyHead;
            ListNode fast = dummyHead;

            for (int i = 0; i < n + 1; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;

            return dummyHead.next;
        }
    }
}
