class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> a = new ArrayList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty())
        {
            int e = q.remove();

            if(!vis[e])
            {
                vis[e] = true;
                a.add(e);
                for(int i=0;i<adj.get(e).size();i++)
                {
                    q.add(adj.get(e).get(i));
                }
            }
            
        }
                    return a;
        
    }
}
