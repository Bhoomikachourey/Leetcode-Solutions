class Solution {
    private static long maximum(int[] piles){
        long max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        return max;
    }
    private static long findhours(int[] piles, long n){
        long count=0;
        for(int num:piles){
            count+=(long)(num+n-1)/n;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        long low=1;
        long high=maximum(piles);
        while(low<=high){
            long mid=low+(high-low)/2;
            long totalhours=findhours(piles,mid);
            if(totalhours<=(long)h) high=mid-1;
            else low=mid+1;
        }
        return (int)low;
    }
}