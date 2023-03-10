class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node f = head;
        Node s = head;
        int k = 0;
                Node j = null;
        
        while(f!=null && f.next!=null)
        {
            j = s;
            f = f.next.next;
            s = s.next;
            if(f==s)
            {
                k=1;
                break;
            }

        }
        if(k==0)
        return;
        
        s = head;
        
        while(s!=f)
        {
            j = j.next;
            f=f.next;
            s=s.next;
        }
        j.next = null;
    }
}
