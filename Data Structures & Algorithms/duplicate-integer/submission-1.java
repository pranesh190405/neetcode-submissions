class Solution {
    public boolean hasDuplicate(int[] arr) {
        Map <Integer,Integer> map = new HashMap<>();
        for (int it:arr){
            if(map.containsKey(it)){
                return true;
            }
            else { 
                map.put(it,1);
                }
            }
        return false;
    }
}