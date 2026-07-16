class Solution {
    public boolean isAnagram(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean flag = true ;
        int n = Math.min(a.length,b.length);
        for (int i=0;i<n;i++){
            if (a[i]!=b[i]){
                flag = false;
            }
        }
        return flag;
    }
}
