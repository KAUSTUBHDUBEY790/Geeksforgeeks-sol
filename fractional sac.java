class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) 
    {
        // Your code here
        double k[][] = new double[n][2];
        for(int i=0;i<n;i++)
        {k[i][1]=arr[i].value/(double)arr[i].weight;
        k[i][0]=i;}
        Arrays.sort(k,Comparator.comparingDouble(o->o[1]));
        int z=n-1;
        double sum = 0;
        while(z>=0)
        {
            if(arr[(int)k[z][0]].weight<=w)
            {sum+=arr[(int)k[z][0]].value;
                w-=arr[(int)k[z][0]].weight;
            }
            else
            {
                sum+=k[z][1]*w;
                w=0;
            }
            z--;
        }
        return sum;
    }
}
