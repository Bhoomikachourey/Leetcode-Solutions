class Solution {
    private static void merge(int nums[],int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if(nums[i]>nums[j]){
                temp[k++]=nums[j++];
            }else{
                temp[k++]=nums[i++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }
        k=0;
        for(int l=si;l<=ei;l++,k++){
            nums[l]=temp[k];
        }
    }
    private static int totalCount(int nums[], int si, int mid,int ei){
        int cnt=0;
        int right=mid+1;
        for(int low=si;low<=mid;low++){
            while(right<=ei && nums[low]>(long)2*nums[right]){
                right++;
            }
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    private static int mergeSort(int nums[], int si, int ei){
        int cnt=0;
        if(si>=ei){
            return cnt;
        }
        int mid=si+(ei-si)/2;
        cnt+=mergeSort(nums, si, mid);
        cnt+=mergeSort(nums,mid+1,ei);
        cnt+=totalCount(nums,si,mid, ei);
        merge(nums, si, mid, ei);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}