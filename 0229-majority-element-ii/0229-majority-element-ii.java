class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && el2!=nums[i]){
                el1=nums[i];
                count1=1;
            }
            else if(count2==0 && el1!=nums[i]){
                el2=nums[i];
                count2=1;
            }
            else if(nums[i]==el1){
                count1++;
            }
            else if(nums[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1)count1++;
            else if(nums[i]==el2)count2++;
        }
        int mini=nums.length/3+1;
        if(count1>=mini)list.add(el1);
        if(count2>=mini)list.add(el2);
        return list;
    }
}