class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int i=0;
        while(i+1<n)
        {
            int t = a[i];
            a[i] = a[i+1];
            a[i+1] = t;
            i+=2;
        }
    }
}
        
