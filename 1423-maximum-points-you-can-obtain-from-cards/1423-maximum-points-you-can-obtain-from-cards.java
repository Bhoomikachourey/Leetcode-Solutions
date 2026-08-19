class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int left=0;
        int right=n-1;
        int maxSum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        left=k-1;
        maxSum=sum;
        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[left];
            sum+=cardPoints[right];
            right--;
            left--;
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }
}