class Solution {
    private long value(int n, int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            list.add((int)(value(rowIndex,i)));
        }
        return list;
    }
}