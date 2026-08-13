class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0, left=0, right=m-1, bottom=n-1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right){
            //print top
            for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);
            }
            top++;
            //print right
                for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            
            right--;
            //print bottom
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                list.add(matrix[bottom][j]);
            }
            bottom--;
            }
            //print left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }  
            left++;
            }
            
        }
        return list;
    }
}