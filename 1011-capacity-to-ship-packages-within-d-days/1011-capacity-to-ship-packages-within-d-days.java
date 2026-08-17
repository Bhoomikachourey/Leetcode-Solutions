class Solution {
    private static int maxi(int[] weights){
        int maxi=Integer.MIN_VALUE;
        for(int num:weights){
            maxi=Math.max(num, maxi);
        }
        return maxi;
    }
    private static int add(int weights[]){
        int sum=0;
        for(int num:weights){
            sum+=num;
        }
        return sum;
    }
    private static int func(int weights[], int capacity){
        int days=1;
        int currentWeight=0;
        for(int weight:weights){
            if(currentWeight+weight<=capacity){
                currentWeight+=weight;
            }else{
                days++;
                currentWeight=weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=maxi(weights);
        int high=add(weights);
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalDays=func(weights, mid);
            if(totalDays<=days)high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}