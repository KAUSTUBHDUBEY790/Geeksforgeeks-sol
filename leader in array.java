class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max=arr[n-1];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(max<=arr[i])
            {
                max=arr[i];
                a.add(max);
            }
        }
        Collections.reverse(a);
        return a;
    }
}
