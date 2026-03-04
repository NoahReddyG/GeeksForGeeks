class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n=arr.length;
        int maxSum=0, xor=0;
        int l=0, r=0, ind=0;
        while(r<n)
        {
            if(ind<k)
            {
                xor^=arr[r];
                ind++;
                r++;
            }
            else
            {
                xor^=arr[l];
                l++;
                ind--;
            }
            if(ind==k)
            {
                maxSum=Math.max(maxSum, xor);    
            }
        }
        return maxSum;
    }
}      