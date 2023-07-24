/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

         if (head == null) {
            return null; // Edge case: empty linked list
        }

        // we will create a dummy node with left and right pointers.
        // we are creating a dummy node so that left ponyer gets to the node
        // that needs to be removed.

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode left = dummyNode;
        ListNode right = dummyNode;

        for(int i = 0 ;i<=n;i++){
            right = right.next;
        }

        while (right != null){
            right = right.next;
            left = left.next;

        }
        left.next = left.next.next;

        return dummyNode.next;
    }
}
 
^C
