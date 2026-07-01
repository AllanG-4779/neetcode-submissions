class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        var first = getMap(s);
        var second = getMap(t);
       
        for (var entry : first.entrySet()){
            Long parent = entry.getValue();
            Long other = second.get(entry.getKey());
           
           if (other==null || !parent.equals(other)) {             
            return false;
           }
        }
        return true;

       


    }

    HashMap<Character, Long> getMap(String s){
      var mapper = new HashMap<Character, Long>();
        for (int i = 0; i<s.length(); i++){
           if (mapper.get(s.charAt(i))==null){
              mapper.put(s.charAt(i), 0L);
           }
           mapper.put(s.charAt(i), mapper.get(s.charAt(i))+1L);
        }
        return mapper;
    }
}