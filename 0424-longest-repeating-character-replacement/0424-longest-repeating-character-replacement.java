class Solution {
    public int characterReplacement(String s, int k) {
        int hash[]=new int[256];
        int left=0;
        int right=0;
        int n=s.length();
        int maxFreq=0;
        int maxLen=0;
        while(right<n){
            hash[s.charAt(right)]++;
            maxFreq=Math.max(maxFreq, hash[s.charAt(right)]);
            if((right-left+1)-maxFreq>k){
                hash[s.charAt(left)]--;
                left++;
            }
            if((right-left+1)-maxFreq<=k){
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}