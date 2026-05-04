class Solution {
    public boolean isBinaryPalindrome(int n) {
        String s=Integer.toBinaryString(n);
        int l=s.length()-1;
        int x=0;
        while(x<l)
        {
            if(s.charAt(x)!=s.charAt(l))
            return false;
            x++;
            l--;
        }
        return true;
    }
};