class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int i=0;
        while(head!=null)
        {
        head=head.next;
        i++;
    }
    return i;
    }
}
