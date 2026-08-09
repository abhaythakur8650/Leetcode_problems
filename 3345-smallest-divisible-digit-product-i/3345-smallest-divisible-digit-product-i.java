class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i>=n)
        {
             int d=i;
            int pro=1;
         while(d!=0)
         {
           int rem=d%10;
            pro=pro*rem;
            d=d/10;
         }
         if(pro%t==0)
         return i;
         else
         i++;

        }
        return -1;
    }
}