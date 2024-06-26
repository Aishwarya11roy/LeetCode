class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode  = new ListNode(0);
        ListNode currentNode  = tempNode;
        while(list1 != null  && list2 != null){
            if(list1.val <= list2.val){
                currentNode.next = list1;
                list1 = list1.next;
            }
            else{
                 currentNode.next = list2;
                list2 = list2.next;

            }
            currentNode = currentNode.next;

        }
        currentNode.next =  list1 != null ? list1 : list2;
      
        return tempNode.next;


    }
}