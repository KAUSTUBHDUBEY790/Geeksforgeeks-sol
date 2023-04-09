
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int a[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        }
        int ab[] = new int[2];
        for(int i=1;i<n+1;i++)
        {
            if(a[i]==0)
            ab[1]=i;
            if(a[i]>1)
            ab[0]=i;
        }
        return ab;
        
    }
}
