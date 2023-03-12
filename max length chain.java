class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       int p[][] = new int[n][2];
       for(int i=0;i<n;i++)
       {
           p[i][0]= arr[i].x;
           p[i][1]= arr[i].y;
       }
        Arrays.sort(p,Comparator.comparingDouble(o->o[1]));
        int s = p[0][1];
        int chain = 1;
        for(int i=1;i<p.length;i++)
        {
            if(p[i][0]>s)
            {
                s = p[i][1];
                chain++;
            }
        }
        return chain;
    }
}
