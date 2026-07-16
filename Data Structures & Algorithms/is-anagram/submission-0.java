class Solution {
    public boolean isAnagram(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean flag = true ;
        for (int i=0;i<b.length;i++){
            if (a[i]!=b[i]){
                flag = false;
            }
        }
        return flag;
    }
}
