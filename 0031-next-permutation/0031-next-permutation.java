class Solution {
    private void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    private void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        //find break point
        int j=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                j=i-1;
                break;
            }
        }
        if(j==-1){
            reverse(nums, 0, n-1);
        }
        else{
            for(int i=n-1;i>j;i--){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                    break;
                }
            }
            reverse(nums, j+1, n-1);
        }
    }
}