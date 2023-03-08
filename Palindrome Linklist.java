class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
         Node mid = head;
        Node k = head;
        while(k!=null && k.next!=null)
        {
            mid=mid.next;
            k=k.next.next;
        }
        Node prev = null;
        Node curr = mid;
        while(curr!=null)
        {
            Node a = curr.next;
            curr.next = prev;
            prev = curr;
            curr = a;
        }
        while(head!=null && prev!=null)
        {
            if(head.data!=prev.data)
            return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }    
}
