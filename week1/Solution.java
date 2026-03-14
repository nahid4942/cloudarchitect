package week1;


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
                temp=temp.next;

            }
        }
        return head;
    }
}
