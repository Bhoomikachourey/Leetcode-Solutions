class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left=0;
        int right=0;
        int maxLen=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(right<n){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1);
            }else{
                map.put(fruits[right],1);
            }
            if(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            if(map.size()<=2){
                int len=right-left+1;
                maxLen=Math.max(len, maxLen);
            }
            right++;
        }
        return maxLen;
    }
}