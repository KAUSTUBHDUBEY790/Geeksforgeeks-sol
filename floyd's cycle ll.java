class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
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
