class Solution {
    public int candy(int[] ratings) {
        int sum=1;
        int i=1;
        int n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            //going upwards
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            //going downwards
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(peak<down){
                sum+=down-peak;
            }
        }
        return sum;
    }
}