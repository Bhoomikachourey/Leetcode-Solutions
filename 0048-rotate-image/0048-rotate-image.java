class Solution {
    private void swap(int[][] matrix, int row, int col){
        int temp=matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]=temp;
    }
    private void swapList(int list[]){
        int start=0;
        int end=list.length-1;
        while(start<end){
            int temp=list[start];
            list[start]=list[end];
            list[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        //transpose
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++){
            swapList(matrix[i]);
        }
    }
}