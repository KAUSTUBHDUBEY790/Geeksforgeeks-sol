class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node s=head;
         Node f=head;
         while(f!=null && f.next!=null)
         {
             s = s.next;
             f = f.next.next;
         }
         return s.data;
    }
}
