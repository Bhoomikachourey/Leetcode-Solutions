class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int n=arr.length;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        int left=0;
        int right=0;

        while(right<n){
            sum+=arr[right];
            while(sum>=k){
                minLen=Math.min(minLen, right-left+1);
                sum-=arr[left];
                left++;
            }
            right++;
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}