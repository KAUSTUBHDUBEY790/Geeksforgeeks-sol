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
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int i=0,j=n-1,l=0,k=n-1;
        int ans= 0;
        while(i<n && j>=0)
        {
            if(l==n)
            {
                l=0;
                i++;
                if(i >= n) // Check if i is still within bounds
                    break;
            }
            if(k<0)
            {
                k=n-1;
                j--;
                if(j < 0) // Check if j is still within bounds
                    break;
            }
            if(mat1[i][l] + mat2[j][k] ==x)
            {
                ans++;
                l++;
                k--;
            }
            else if(mat1[i][l] + mat2[j][k] >x)
            {
                k--;
            }
            else
            {
                l++;
            }
        }
        return ans;
    }
}
