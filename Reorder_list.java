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
    public void reorderList(ListNode head) {

        ListNode slowptr = head;
        ListNode fastptr = head;
        // Step 1: Find the middle of the linked list
        // using slow and fast pointers
        while(fastptr != null && fastptr.next != null && 
        fastptr.next.next !=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        ListNode secondhalf = reverselinkedlist(slowptr.next);
        //break the linked list 
        slowptr.next = null;  

        // Step 3: Merge the first half and the reversed second half
        mergeLists(head, secondhalf);
    
    }
    public ListNode reverselinkedlist(ListNode head){
         ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }
    public void mergeLists(ListNode list1, ListNode list2){
          while (list1 != null && list2 != null) {
            ListNode nextList1 = list1.next;
            ListNode nextList2 = list2.next;

            list1.next = list2;
            list2.next = nextList1;

            list1 = nextList1;
            list2 = nextList2;
        }
    }

   
}
