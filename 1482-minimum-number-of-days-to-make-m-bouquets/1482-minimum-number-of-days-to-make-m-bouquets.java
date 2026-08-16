class Solution {
    private int maxi(int bloomDay[]){
        int maxi=Integer.MIN_VALUE;

        for(int num:bloomDay){
            maxi=Math.max(num, maxi);
        }
        return maxi;
    }
    private static int mini(int bloomDay[]){
        int mini=Integer.MAX_VALUE;
        for(int num:bloomDay){
            mini=Math.min(num,mini);
        }
        return mini;
    }
    private static long total(int[] arr, long days,int k){
        long flowers=0;
        long bouquets=0;
        for(int num:arr){
            if((long)num<=days){
                flowers++;
                
                if(flowers==k){
                    bouquets+=1;
                    flowers=0;
                }
            } else{
                flowers=0;
            }
        }
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n)return -1;
        long low=(long)mini(bloomDay);
        long high=(long)maxi(bloomDay);

        while(low<=high){
            long mid=low+(high-low)/2;
            long bouquets=total(bloomDay,mid,k);
            if(bouquets>=(long)m) high=mid-1;
            else low=mid+1;
        }
        return (int)low;
    }
}