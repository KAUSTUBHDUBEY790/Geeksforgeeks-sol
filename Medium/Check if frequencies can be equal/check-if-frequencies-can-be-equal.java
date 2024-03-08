//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int[] a = new int[26];
        int m=0;
        for(char i:s.toCharArray())
        {
            a[i-'a']++;
            m = Math.max(m,a[i-'a']);
        }
        if(freq(a,m))
        return true;
        
        for(int i=0;i<26;i++)
        {
            if(a[i]>0)
            {
                a[i]--;
                if(freq(a,a[i]))
                return true;
                
                a[i]++;
            }
        }
        return false;
        

    }
    boolean freq(int a[],int n)
    {
        for(int i=0;i<25;i++)
        {
           if(a[i]!=0)
           {
               if(a[i]!=n)
               return false;
           }
        }
        return true;
    }
}