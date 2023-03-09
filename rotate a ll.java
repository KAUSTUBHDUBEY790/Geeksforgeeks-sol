class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        int z=0;
        Node a=head;
        while(a!=null)
        {
            z++;
            a=a.next;
        }
        if(z<=k)
        return head;
        z=0;
        a=head;
        while(z<k-1)
        {
            a = a.next;
            z++;
            
        }
        Node q = a.next;
        Node w = q;
        a.next = null;
        while(q.next!=null)
        q=q.next;
        q.next = head;
        return w;
    }
}
