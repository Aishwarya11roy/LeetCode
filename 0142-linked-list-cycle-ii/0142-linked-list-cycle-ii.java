/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*
 Brute Force : Using a hashmap (Node , Integer). So instead of saving node data 
 i should store node because we are checking the reference. Two different node can have the same value.

 Optimized : Tortoise and Hare
 1. Detect a loo
 2. MOve the slow pointer to head and move fast and slow pointer by one simultaneously.
 TC : O(N),
 SC : O(1)
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}