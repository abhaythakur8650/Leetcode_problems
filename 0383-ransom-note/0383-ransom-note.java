class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          if(ransomNote.length()>magazine.length())
          return false;
         HashMap<Character,Integer>map1=new HashMap<>();
         HashMap<Character,Integer>map2=new HashMap<>();
      
        for(int i=0;i<ransomNote.length();i++)
        {
        char key=ransomNote.charAt(i);
        if(map1.containsKey(key))
        {
            int val=map1.get(key);
             map1.put(key,val+1);
        }
        else
        map1.put(key,1);
        }
         for(int i=0;i<magazine.length();i++)
        {
        char key=magazine.charAt(i);
        if(map2.containsKey(key))
        {
            int val=map2.get(key);
             map2.put(key,val+1);
        }
        else
        map2.put(key,1);
        }

    for(char key:map1.keySet())
    {
      
        int value1=map1.get(key);
        if(!map2.containsKey(key))
        return false;
        int value2=map2.get(key);
        if(value1>value2)
        return false;
    }
    return true;
    }
}