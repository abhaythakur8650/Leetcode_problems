class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
       Arrays.sort(nums);
       int n=nums.length;
       int [] pre=new int [n];
       pre[0]=nums[0];
       for(int i=1;i<n;i++)
       {
        pre[i]=pre[i-1]+nums[i];
       } 
       
       for(int i=0;i<queries.length;i++)
       {
        int low=0;
       int high=n-1;
        boolean flag=false;
       while(low<=high)
       {
        int mid=low+(high - low)/2;
        if(pre[mid]==queries[i])
        {
          queries[i]=mid+1;
          flag=true;
           break;
        }
        else if (pre[mid]<queries[i])
        {
            low=mid+1;
        }
        else {
            high=mid-1;
        }
       }
       if(flag==false)
       {
       queries[i]=low;
       }
    }
    return queries;
}
}