class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0]-b[0];
            }
        });
        int n=intervals.length;
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];

            if(list.isEmpty() || start>list.get(list.size()-1)[1]){
                list.add(new int[]{start,end});
            }else{
                list.get(list.size()-1)[1]=Math.max(end,list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}