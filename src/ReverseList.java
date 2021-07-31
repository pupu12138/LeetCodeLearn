/**
 * @author WYZ
 * @creat 2021-08-01 0:45
 */
public class ReverseList {
    //    主方法未给出
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = cur;
            cur = head;
            head = next;
        }
        return cur;
    }
}
