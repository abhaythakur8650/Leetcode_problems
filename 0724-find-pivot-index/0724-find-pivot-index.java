class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pre[]= Arrays.copyOf(nums,n);
        for(int i=1;i<n;i++)
        {
            pre[i]+=pre[i-1];
        }
        for(int i=0;i<n;i++)
        {
           int left=0;
           int right=0;

           if(i!=0)
           left=pre[i-1];
           if(i!=n-1)
           right=pre[n-1]-pre[i];

            if(left==right)
            return i;
        }
        return -1;
    }
}