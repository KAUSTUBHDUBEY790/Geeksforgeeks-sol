//{ Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    // Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd’s Cycle-Finding Algorithm (Tortoise and Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at the same point, then there is a loop
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        // No loop found, although you mentioned there's always a loop, this is a fallback.
        return 0;
    }

    // Function to count the number of nodes in the loop
    static int countLoopLength(Node nodeInLoop)
    {
        Node temp = nodeInLoop;
        int count = 1;

        // Loop until we meet the same node again
        while (temp.next != nodeInLoop) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
