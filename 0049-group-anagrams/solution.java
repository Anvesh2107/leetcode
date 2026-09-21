class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map=new HashMap<>();

        for(String str:strs){
        char[] lookup=new char[26];
        for(char c: str.toCharArray()){
            lookup[c-'a']++;
        }
        String key= Arrays.toString(lookup);

        map.putIfAbsent(key,new ArrayList<>());

        map.get(key).add(str);

        }

        return new ArrayList<>(map.values());
    }
}
