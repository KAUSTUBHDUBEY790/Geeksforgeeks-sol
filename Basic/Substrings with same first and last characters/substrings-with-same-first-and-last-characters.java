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
            String s = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.countSubstringWithEqualEnds(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countSubstringWithEqualEnds(String s) {
        // code here
        int a[] = new int[26];
        for(int i=0;i<s.length();i++)
        a[s.charAt(i)-'a']++;
        int z=0;
        for(int i=0;i<26;i++)
        z += a[i]+((a[i]*(a[i]-1))/2);
        
        return z;
        
    }
}