class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> a = new ArrayList<>();
        boolean k[] = new boolean[V];
        dfs(adj,0,a,k);
        return a;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int v,ArrayList<Integer> a,boolean[] k)
    {
        a.add(v);
        k[v] = true;
        for(int i=0;i<adj.get(v).size();i++)
        {
            int e = adj.get(v).get(i);
            if(!k[e])
            {
                dfs(adj,e,a,k);
            }
        }
    }
}
