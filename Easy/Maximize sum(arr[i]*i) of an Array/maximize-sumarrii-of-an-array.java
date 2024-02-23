//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.Maximize(a,n));
        }
        
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int m = 1000000007;
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        int i=0;
        long s=0;
        while(i<n)
        {
            s+=(i*(long)arr[i])%m;
            s%=m;
            i++;
        }
        return (int)s%m;
        
    }   
}

