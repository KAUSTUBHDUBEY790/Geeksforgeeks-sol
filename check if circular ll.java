class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	        Node f = head;
        Node s = head;
        while(f!=null && f.next!=null)
        {
            f = f.next.next;
            s = s.next;
            if(f==s)
            return true;

        }
        return false;
    }
}
