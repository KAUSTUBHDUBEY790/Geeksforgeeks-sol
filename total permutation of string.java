class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        
        List<String> l = new ArrayList<>();
        permut(S,"",l);
        HashSet<String> A = new HashSet<String>(l);
        List<String> k = new ArrayList<>(A);
        Collections.sort(k);
            return k;
        
    }
    public void permut(String s,String k,List<String> j)
    {
        if(s.length()==0)
        {
            j.add(k);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ka = s.charAt(i);
            String new_s = s.substring(0,i)+s.substring(i+1);
            permut(new_s,k+ka,j);
        }
    }
}
