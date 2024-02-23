//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] p) {
        // code here
        int a[] = new int[n];
        a[n-1] = 0;
        int m = p[n-1];
        for(int i=n-2;i>=0;i--)
        {
            m = Math.max(m,p[i]);
            a[i] = Math.max(a[i+1],m-p[i]);
        }
        m = p[0];
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
             m = Math.min(m,p[i]);
             a[i] = Math.max(a[i],(p[i]-m)+a[i]);
             max = Math.max(a[i],max);
        }
        return max;
    }

}
        
