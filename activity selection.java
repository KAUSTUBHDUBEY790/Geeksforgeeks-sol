class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int a[][] = new int[n][3];
        for(int i=0;i<n;i++)
        {
            a[i][0] = i;
            a[i][1] = start[i];
            a[i][2] = end[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));
        int maxact = 1;
        int r = a[0][2];
        for(int i=1;i<n;i++)
        {
            if(a[i][1]>r)
            {maxact++;
                r = a[i][2];
            }
            
        }
        return maxact;
    }
}
