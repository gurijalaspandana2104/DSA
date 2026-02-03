 public void reorderList(ListNode head) {
    if(head==null||head.next==null)
    {
        return; 
    }
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
      
    ListNode h1= head;
    ListNode h2=slow.next;
    ListNode prev=null;
    ListNode curr= h2;
    slow.next = null;
    while(curr!=null)
    {
        ListNode temp=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp;
 

    }
             h2 = prev;
     
     while(h1!=null&&h2!=null)
     {
         ListNode temp1=h1.next;
         ListNode temp2=h2.next;
         h1.next=h2;
         h2.next=temp1;
         h1=temp1;
         h2=temp2;
     }
     
  

}
