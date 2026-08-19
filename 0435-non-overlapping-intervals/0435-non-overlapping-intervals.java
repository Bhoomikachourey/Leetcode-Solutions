class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<>(){
            public int compare(int a[], int b[]){
                return a[1]-b[1];
            }
        });
        int lastEnd=Integer.MIN_VALUE;
        int count=0;
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            if(start>=lastEnd){
                lastEnd=intervals[i][1];
            }else{
                count++;
            }
        }
        return count;
    }
}