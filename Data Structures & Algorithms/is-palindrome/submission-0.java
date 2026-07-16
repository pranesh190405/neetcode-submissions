class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else {
                left ++;
                right--;
            }
        }
        return true;
    }
}
