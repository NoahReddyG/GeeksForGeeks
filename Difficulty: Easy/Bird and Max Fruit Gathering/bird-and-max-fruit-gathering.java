class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int l=arr.size();
        int ms=0, sum=0;
        for(int i=0;i<l+m-1;i++)
        {
        if(i>=m)
        sum-=arr.get(i-m);
        sum+=arr.get(i%l);
        ms=Math.max(sum,ms);
        }
        return ms;
    }
}