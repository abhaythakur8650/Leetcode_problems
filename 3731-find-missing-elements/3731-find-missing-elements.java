class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         ArrayList<Integer> ans=new ArrayList<>();
         for(int x:nums)
         {
            ans.add(x);
         }
        ArrayList<Integer> res=new ArrayList<>();
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
        if(nums[i]<min)
        {
            min=nums[i];
        }
        if(nums[i]>max)
        {
            max=nums[i];
        }
       }
       for(int i=min;i<=max;i++)
       {
       if(!ans.contains(i))
       {
         res.add(i);
       }
       }
   return res;
    }
}