class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int prod = 1;
        int zeroCount = 0;

        // Calculate product of non-zero elements
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } 
            else if (zeroCount == 1) {
                arr[i] = (nums[i] == 0) ? prod : 0;
            } 
            else {
                arr[i] = prod / nums[i];
            }
        }

        return arr;
    }
}