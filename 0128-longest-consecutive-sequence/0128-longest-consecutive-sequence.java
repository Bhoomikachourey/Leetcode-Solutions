class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int maxCount=0;
        for(int val:set){
            int count=1;
            if(!set.contains(val-1)){
               while(set.contains(val+1)){
                count++;
                val++;
            }  
            }
           
            maxCount=Math.max(count, maxCount);
        }
        return maxCount;
    }
}