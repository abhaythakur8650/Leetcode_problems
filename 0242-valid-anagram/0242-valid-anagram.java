class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
     HashMap <Character,Integer> smap=new HashMap<>();
     HashMap <Character,Integer> tmap=new HashMap<>();
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(smap.containsKey(ch))
        {
        int m=smap.get(ch);
      smap.put(ch,m+1);
        }
        else
        {
            smap.put(ch,1);
        }
     }
     for(int i=0;i<s.length();i++)
     {
        char ch=t.charAt(i);
        if(tmap.containsKey(ch))
        {
       int n= tmap.get(ch);
       tmap.put(ch,n+1);
        }
        else
        {
            tmap.put(ch,1);
        }
     }
  for(int i=0;i<s.length();i++)
  {
    char ch=s.charAt(i);
    int val1=smap.get(ch);
     if(!tmap.containsKey(ch))
     return false;
    int val2=tmap.get(ch);
     if(val1!=val2)
     return false;
  }
  return true;
    }
}