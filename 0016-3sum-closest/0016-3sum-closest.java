class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
      int n=nums.length;
      int ans=Integer.MAX_VALUE;
      int res=0;
      for(int i=0;i<n-2;i++)  
      {
        int j=i+1;
        int k=n-1;
        
        while(j<k)
        {
        int sum=nums[i]+nums[j]+nums[k];
        int diff =Math.abs(target-sum);
         if(diff<ans)
          {
          ans=diff;
          res=sum;
          }
            if(sum==target)
            {
            return target;
            }
            else if(sum>target)
            {
             k--;
            }
            else if(sum<target)
            {
                j++;
            }
        }

      }
return res;

    }
}