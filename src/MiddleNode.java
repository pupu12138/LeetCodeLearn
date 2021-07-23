/**
 * @author WYZ
 * @creat 2021-07-23 11:00
 */
public class MiddleNode {
//    本算法为展示main方法;

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
        public ListNode middleNode(ListNode head) {
            int i = 0;
            ListNode first = head;
            while (first != null) {
                i++;
                first = first.next;
            }
            int j = 0;
            first = head;
            while (j < i / 2) {
                j++;
                first = first.next;
            }
            return first;
        }
    }
}
