//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        int c=0;
        first = rev(first);
        second = rev(second);
        Node head = null;
        Node tail = null;
        while(first!=null && second != null)
        {
            int s = c + first.data + second.data;
            c = s/10;
            Node sum = new Node(s%10);
            if(head==null)
            {
                head = sum;
                tail = sum;
            }
            else
            {
                tail.next = sum;
                tail = tail.next;
            }
            first = first.next;
            second = second.next;
        }
        if(first!=null)
        {
            while(first!=null)
            {
            int s = c + first.data;
            c = s/10;
            Node sum = new Node(s%10);
            if(head==null)
            {
                head = sum;
                tail = sum;

            }
            else
            {
                tail.next = sum;
                tail = tail.next;
            }
            first = first.next;
            }
        }
       else if(second!=null)
        {
            while(second!=null)
            {
            int s = c + second.data;
            c = s/10;
            Node sum = new Node(s%10);
            if(head==null)
            {
                head = sum;
                tail = sum;
            }
            else
            {
                tail.next = sum;
                tail = tail.next;
            }
            second = second.next;
            }
        }
        if(c!=0)
        {
            Node sum = new Node(c);
             if(head==null)
            {
                head = sum;
                tail = sum;
            }
            else
            {
                tail.next = sum;
                tail = tail.next;
            }
            
        }

        return rev(head);
        
    }
    static Node rev(Node head)
    {
        Node cur = head;
        Node next = null;
        Node prev = null;
        while(cur!=null)
        {
            next  =  cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}