class Solution {
    public int smallestSubstring(String s) {
        if(!s.contains("0") || !s.contains("1") || !s.contains("2")){
            return -1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int minLength=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()==3){
                char leftChar=s.charAt(left);
                minLength=Math.min(minLength,(right-left)+1);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
        }
        return minLength;
    }
};