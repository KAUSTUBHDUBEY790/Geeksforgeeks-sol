//{ Driver Code Starts
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;


class count_pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];

            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];

            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

            int x = sc.nextInt();
            Solution gfg = new Solution();
            System.out.println(gfg.countPairs(head1, head2, x));
        }
    }
}
// } Driver Code Ends


// your task is to complete this function

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        for (Integer val : head1) {
            set.add(val);
        }

        for (Integer val : head2) {
            if (set.contains(x - val)) {
                cnt++;
            }
        }

        return cnt;
    }
}