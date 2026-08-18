class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxcnt=0;
        int index=0;
        for(int i=0;i<mat.length;i++){
            int cntOnes=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cntOnes++;
                }
            }
            if(cntOnes>maxcnt){
                index=i;
                maxcnt=cntOnes;
            }
        }
        return new int[]{index, maxcnt};
    }
}