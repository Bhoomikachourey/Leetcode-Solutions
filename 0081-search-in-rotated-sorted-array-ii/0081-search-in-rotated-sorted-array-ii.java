class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid])return true;
            if(nums[high]==nums[mid] && nums[mid]==nums[low]){
                low++;
                high--;
                continue;
            }
            //left part is sorted
            if(nums[low]<=nums[mid]){
                if(target<=nums[mid] && target>=nums[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{ //right part is sorted
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}