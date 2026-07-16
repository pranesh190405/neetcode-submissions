class Solution {
    public boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return s.equals(rev);
    }
}