/**
 * @author WYZ
 * @creat 2021-08-11 0:07
 */
public class GetKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast = head;
            ListNode slow = head;

            if (head == null || k == 0) {
                return null;
            }
            for (int i = 0; i < k && fast != null; i++) {
                fast = fast.next;
            }
            while (fast!=null){
                fast = fast.next;
                slow = slow.next;
            }return slow;
        }
    }
}
