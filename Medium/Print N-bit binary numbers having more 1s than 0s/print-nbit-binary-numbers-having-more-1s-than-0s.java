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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    void solve(int n, String str, int cnt0, int cnt1, ArrayList<String> list){
        
        if(n == 0){
            if(cnt1 >= cnt0){
                list.add(str);
            }
            return;
        }
        
        solve(n-1, str + '1', cnt0, cnt1+1, list);
        
        if(cnt1 > cnt0) // if here cnt1 will be bigger, then may be after this they could be equal only.
          solve(n-1, str + '0', cnt0+1, cnt1, list);
    }
    
    ArrayList<String> NBitBinary(int N) {
        
        ArrayList<String> ans = new ArrayList<>();
        
        solve(N, "", 0, 0, ans);
        
        return ans;
    }
}