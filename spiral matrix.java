
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> a = new ArrayList<Integer>();
        int startr = 0;
        int startc = 0;
        int endr = r-1;
        int endc = c-1;
        while(startr<=endr && startc<=endc)
        {
            //top
            for(int i=startc;i<=endc;i++)
            a.add(m[startr][i]);
            //right
            for(int i=startr+1;i<=endr;i++)
            a.add(m[i][endc]);
            //bottom
            for(int i=endc-1;i>=startc;i--)
            {
                if(startr==endr)
                break;
            a.add(m[endr][i]);}
            //left
            for(int i=endr-1;i>=startr+1;i--)
            {
                //if you already taken the number into account dont need to print it twice
                if(startc==endc)
                break;
                a.add(m[i][startc]);
                
            }      
            startr++;
            startc++;
            endr--;
            endc--;
            
        }
        return a;
    }
}
