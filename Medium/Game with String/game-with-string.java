//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
        int a[] = new int[26];
        for(char i:s.toCharArray())
        a[i-97]++;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++)
        if(a[i]!=0)
        q.add(a[i]);
        
        while(k!=0)
        {
            int w = q.poll();
            w--;
            k--;
            q.add(w);
        }
        int z=0;
        while(!q.isEmpty())
        {
            z+=q.peek()*q.peek();
            k = q.poll();
        }
        return z;
    }
}