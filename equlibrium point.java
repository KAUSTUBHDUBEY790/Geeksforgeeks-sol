class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int s=0;
        for(int i=0;i<n;i++)
        s+=arr[i];
        
        
        int su=0;
        for(int i=0;i<n;i++)
        {
            if(su==s-arr[i]-su)
            return i+1;
            su+=arr[i];
        }
        return -1;
    }
}
