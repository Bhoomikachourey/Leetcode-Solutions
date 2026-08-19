class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[256];
        Arrays.fill(arr, -1);
        int left=0;
        int right=0;
        int maxLen=0;
        int n=s.length();
        while(right<n){
            if(arr[s.charAt(right)]!=-1){
                left=Math.max(arr[s.charAt(right)]+1,left);
            }
            int len=right-left+1;
            maxLen=Math.max(maxLen,len);
            arr[s.charAt(right)]=right;
            right++;
        }
        return maxLen;
    }
}