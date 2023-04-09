class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int a[] = new int[n+1];
        ArrayList<Integer> aa = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        }
        for(int i=0;i<n+1;i++)
        if(a[i]>1)
        aa.add(i);
        
        if(aa.size()==0)
        aa.add(-1); 
        return aa;
    }
}
