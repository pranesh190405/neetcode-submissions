class Solution {
    public int[] twoSum(int[] arr, int target) {
       Map <Integer,Integer> map = new HashMap<>();
       int n = arr.length;
       Integer required = 0;
       for (int i=0;i<n;i++){
        required = target-arr[i];
        if(map.containsKey(required)){
            return new int []{map.get(required),i};
        }
        else {
            map.put(arr[i],i);
        }
       }
       return new int [] {-1,-1};
    }
}
