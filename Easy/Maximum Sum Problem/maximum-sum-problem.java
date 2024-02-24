//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n==0) return 0;
        int t[]=new int[n+1];
        t[0]=0;
        t[1]=1;
        for(int i=2;i<n+1;i++){
            t[i]=Math.max(t[i/2]+t[i/3]+t[i/4],i);
        }
        return t[n];
    } 
}