class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int n=word1.length();
        int n2=word2.length();
        int i=0;
        int j=0;
        while(i<n&&j<n2)
        {
        ans.append(word1.charAt(i));
        i++;
        ans.append(word2.charAt(j));
        j++;
        }

        while(i<n)
        {
        ans.append(word1.charAt(i));
        i++;
        }
        while(j<n2)
        {
        ans.append(word2.charAt(j));
        j++;
        }
   return ans.toString();
    }
}