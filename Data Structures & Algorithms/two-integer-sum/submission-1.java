class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i =0;
        int j=arr.length -1 ;
        int [] nums = new int [2];
        while(i<j){
            if (arr[i]+arr[j]==target){
                nums[0] = i;
                nums[1] = j;
            }
            else if (arr[i]+arr[j]<target){
                i++;
            }
            else {
                j++;
            }
        }
        return arr;
    }
}
