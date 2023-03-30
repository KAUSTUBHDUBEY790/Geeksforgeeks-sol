class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        while(i<n)
        {
            if(map.containsKey(a[i]))
            {
                int aa = map.get(a[i]);
                map.put(a[i],aa+1);
                // System.out.println(map.get(a[i]));
            }
            else
            map.put(a[i],1);
            if(map.get(a[i])==k)
            return a[i];
            i++;
        }
        return -1;
        
        
    } 
}
