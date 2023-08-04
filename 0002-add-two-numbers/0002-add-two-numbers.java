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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Create a dummy head node
        ListNode result = dummyHead; // Initialize a result node pointing to the dummy head
        int carry = 0; // Initialize carry to 0

        while (l1 != null || l2 != null) {
            int sum = carry; // Start with the carry value

            if (l1 != null) {
                sum += l1.val; // Add the value from l1
                l1 = l1.next; // Move to the next node in l1
            }

            if (l2 != null) {
                sum += l2.val; // Add the value from l2
                l2 = l2.next; // Move to the next node in l2
            }

            carry = sum / 10; // Update the carry for the next iteration
            sum = sum % 10; // Calculate the value to be stored in the result node

            result.next = new ListNode(sum); // Create a new node with the calculated value
            result = result.next; // Move the result pointer to the next node
        }

        if (carry == 1) {
            result.next = new ListNode(1); // If there is a remaining carry, add an additional node with a value of 1
        }

        return dummyHead.next; // Return the next node after the dummy head (actual result)
    }
}
