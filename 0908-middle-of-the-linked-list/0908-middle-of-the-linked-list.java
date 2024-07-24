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
 /*
 Brute Force solution : Iterate over the linked list and find the total number of nodes after keep a count for the nodes and then find : count/ 2 + 1.
 Again iterate over the linkedlist till the count >= 0 , and the note which the iteration stops at is middle node.

 T.C : O(N) + O(N/2)
 S.C : O(1)

Optimization(in one pass):
Use fast and slow pointer technique.
tc :o(n/2) where n is the size of the linked list

 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;


        
    }
}