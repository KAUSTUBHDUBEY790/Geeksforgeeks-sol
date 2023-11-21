//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        String[] parts = s.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            if (!part.matches("0|[1-9]\\d{0,2}") || Integer.parseInt(part) > 255) {
                return false;
            }
        }

        return !s.endsWith(".");
    }}