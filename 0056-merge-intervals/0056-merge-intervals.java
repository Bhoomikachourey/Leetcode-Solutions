class Solution {
    public int[][] merge(int[][] intervals) {
        //sorting
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            //skip all the merged intervals
            if(!list.isEmpty() && end<=list.get(list.size()-1)[1]){
                continue;
            }
            //check for the rest interval
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                    i=j-1;
                }
                else{
                    break;
                }
            }
            list.add(new int[]{start,end});
        }
        return list.toArray(new int[list.size()][]);
    }
}