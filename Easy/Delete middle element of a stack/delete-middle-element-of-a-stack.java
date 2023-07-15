//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sz){
        // code here
        int count =1;
        int pos = (int)Math.ceil(((sz+1)/2.0));
        delete(s,count,pos);
    }
    public void delete(Stack<Integer>s,int c,int p)
    {
        if(s.empty())
        return;
        if(c==p)
        {
            s.pop();
            return;
        }
        int k = s.peek();
        s.pop();
        delete(s,c+1,p);
        s.push(k);
    }
}

