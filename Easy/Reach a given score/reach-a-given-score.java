//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t > 0)
        {
            int n = in.nextInt();
            Geeks obj = new Geeks();
            System.out.println(obj.count(n));
            t--;
        }
    }
}
// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
        // Add your code here.
        long a[] = new long[n+1];
        int b[] = {3,5,10};
        a[0] = 1;
        for(int j=0;j<3;j++)
        for(int i=b[j];i<n+1;i++)
        {
            a[i] += a[i-b[j]];
        }
        return a[n];
    }
}