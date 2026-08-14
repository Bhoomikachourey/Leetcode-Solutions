class Solution {
    private static List<Integer> generateRow(int row){
        int val=1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=0;i<row;i++){
            val=val*(row-i);
            val=val/(i+1);
            list.add(val);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(generateRow(i));
        }
        return list;
    }
}