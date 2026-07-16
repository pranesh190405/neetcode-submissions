class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i=0;i<n;i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<m;i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }
}
