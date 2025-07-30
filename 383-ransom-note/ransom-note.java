class Solution {
    public boolean canConstruct(String ransomeNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char ch : ransomeNote.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        for(char ch : magazine.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }
        for(char ch : ransomeNote.toCharArray()){
            if(!map2.containsKey(ch)){
                return false;
            }else{
                if(map1.get(ch) > map2.get(ch)){
                    return false;
                }
            }
        }
        return true;
    }
}