class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
        set.add(nums[i]);
        int ans=0;
        while(nums[i]>0)
        {
        int rev=nums[i]%10;
        ans=ans*10+rev;
        nums[i]=nums[i]/10;
        }
       set.add(ans);
        }

        return set.size();
    }
}