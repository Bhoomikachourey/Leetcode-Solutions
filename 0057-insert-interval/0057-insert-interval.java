class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        int i=0;
        int n=interval.length;
        ArrayList<int[]> list = new ArrayList<>();
        while(i<n && interval[i][1]<newInterval[0]){
            list.add(interval[i]);
            i++;
        }
        while(i<n && newInterval[1]>=interval[i][0]){
            newInterval[0]=Math.min(newInterval[0],interval[i][0]);
            newInterval[1]=Math.max(newInterval[1],interval[i][1]);
            i++;
        }
        list.add(newInterval);
        while(i<n){
            list.add(interval[i]);
            i++;
        }
        int size=list.size();
        int res[][]=new int[size][2];
        for(int j=0;j<size;j++){
            res[j]=list.get(j);
        }
        return res;
    }
}