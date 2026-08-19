class Solution {
    private static int func(int nums[], int k){
                int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(right<n){
            if(map.containsKey(nums[right])){
                map.put(nums[right], map.get(nums[right])+1);
            }else{
                map.put(nums[right],1);
            }
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums, k)-func(nums,k-1);
    }
}