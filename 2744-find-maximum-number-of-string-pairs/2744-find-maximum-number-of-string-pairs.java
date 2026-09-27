class Solution {

      public String reverse (String p)
      {
        StringBuilder sb=new StringBuilder(p);
        sb.reverse();
        return sb.toString();
      }
    public int maximumNumberOfStringPairs(String[] words) {
   
        
      HashSet<String> set=new HashSet<>();
      int n=words.length;
    
      int count =0;
      for(int i=0;i<n;i++)
      {
        if(set.contains(words[i]))
        {
            count++;
        }
        else{
         String s=reverse(words[i]);
         set.add(s);

      }

      }
     
      return count;

    }


}