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
    public ListNode reverseList(ListNode head) {

        //using recursion
        ListNode front;
        if(head == null || head.next == null){
            return head;
        }


        ListNode newNode = reverseList(head.next);
        front = head.next; // 1st iteration front = 5
        front.next = head;
        head.next = null;

        return newNode;
        
    }
}
/**
tc:o(n)
sp:o(n)
 */