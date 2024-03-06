//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int r[] = new int[n];
        r[n-1] = a[n-1];
        int l[] = new int[n];
        l[0] = a[0];
        for(int i=1;i<n;i++)
        l[i] = Math.min(a[i],l[i-1]); 
        for(int i=n-2;i>=0;i--)
        r[i] = Math.max(a[i],r[i+1]); 
        
        int res=-1,i=0,j=0;
        while(i<n && j<n)
        {
            if(l[i]>r[j])
            i++;
            else
            {
                res = Math.max(res,j-i);
                j++;
            }
        }

        return res;
        
    }
}


