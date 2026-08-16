class Solution {
    private static int maximum(int nums[]){
        int maxi=Integer.MIN_VALUE;
        for(int num:nums){
            maxi=Math.max(maxi,num);
        }
        return maxi;
    }
    private static int func(int nums[],int n){
        int total=0;
        for(int num:nums){
            total+=(num+n-1)/n;
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maximum(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=func(nums, mid);
            if(total<=threshold) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}