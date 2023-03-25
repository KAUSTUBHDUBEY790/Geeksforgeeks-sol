class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int i=0;
        while(i+1!=n)
        {
            if(arr[i]>arr[i+1])
            break;
            i++;
        }
        return arr[i];
    }
}
