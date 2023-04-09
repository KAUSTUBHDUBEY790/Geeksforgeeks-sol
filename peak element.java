class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
    //     if(arr[0]>=arr[1])
    //          return 0;
    //   for(int i=1;i<n;i++)
    //   {

    //       if(i==n-1)
    //       {
    //           if(arr[i]>=arr[i-1])
    //           return i;
    //       }
    //       else{
    //           if(arr[i]>=arr[i+1]  && arr[i]>=arr[i-1])
    //           return i;
    //       }
    //   }
    int max = arr[0];
    int idx = 0;
    for(int i=1;i<n;i++)
    {
        if(max<arr[i])
        {
            max = arr[i];
            idx = i;
        }
    }
       return idx;
       
    }
}
