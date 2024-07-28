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
    public ListNode rotateRight(ListNode head, int k) {


        if(head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        } 
        // after the loop temp points to the last node in the list
        //so the next pointer of the last node is set to the head, making the list circular.
        temp.next = head;
        k = k% length;
        k = length -  k; // to determine new heads position
        //A loop is used to move temp k nodes ahead in the circular list. After the loop, temp will point to the node just before the new head.

        while(k-- > 0){
            temp = temp.next;
        }
        head = temp.next; // the new head is temp next
        temp.next = null;
        return head;
   
    }
}
/**
Time Complexity: O(n), where n is the length of the linked list. This is because we traverse the list once to calculate its length and once again to find the new head.
Space Complexity: O(1), as we are using a constant amount of extra space (no additional data structures are used).
 */