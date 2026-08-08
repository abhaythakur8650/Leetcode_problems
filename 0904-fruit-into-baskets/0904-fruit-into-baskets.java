class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=fruits.length;
        int low=0;
        int high=0;
        int len=0;
        for(high=0;high<n;high++)
        {
          map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);
          map.getOrDefault(fruits[high],0);
          while(map.size()>2)
          {
            int left=fruits[low];
            map.put(left,map.get(left)-1);
            if(map.get(left)==0)
            {
                map.remove(left);
            }
            low++;
          }
           len=Math.max(len,high-low+1);
        
        }
        return len;
    }
}