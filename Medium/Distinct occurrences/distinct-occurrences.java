//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String S = line.split(" ")[0];
			String T = line.split(" ")[1];
			
			Solution ob = new Solution();
			System.out.println(ob.subsequenceCount(S,T));
			t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method*/

class Solution
{
    int m = 1000000007;
    int  subsequenceCount(String s, String t)
    {
	// Your code here	
	int a[][] = new int[s.length()][t.length()];
	for(int i=0;i<s.length();i++)
	for(int j=0;j<t.length();j++)
	a[i][j] = -1;
	return solve(s,t,0,0,a)%m;
    }
    public int solve(String s,String t,int i,int j,int[][] a)
    {
        if(j == t.length())
        return 1;
        if(i == s.length())
        return 0;
        if(a[i][j]!=-1)
        return a[i][j];
        if(s.charAt(i)==t.charAt(j))
        {
            return a[i][j] = solve(s,t,i+1,j+1,a)%m + solve(s,t,i+1,j,a)%m;
            
        }
        else{
            return solve(s,t,i+1,j,a)%m;
        }
    }
}