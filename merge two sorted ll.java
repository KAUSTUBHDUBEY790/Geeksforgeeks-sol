class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node sa = new Node(-1);
     Node s = sa;
     while(head1!=null && head2!=null)
     {
         if(head1.data<=head2.data)
         {s.next = head1;
         s = s.next;
             head1= head1.next;
         }
         else if(head1.data>=head2.data){
         s.next  = head2;
         s = s.next;
             head2 = head2.next;
         }
     }
     while(head1!=null)
     {
         s.next = head1;
         s = s.next;
         head1 = head1.next;
     }
    while(head2!=null)
     {
         s.next = head2;
         s = s.next;
         head2 = head2.next;
     }
              return sa.next;
   } 
}
