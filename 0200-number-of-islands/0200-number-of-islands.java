class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    private static void bfs(int i, int j,char[][] grid,
     Queue<Pair> q, boolean vis[][]){
        vis[i][j]=true;
        q.add(new Pair(i, j));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int delrow[]={-1,0,1,0};
            int delcol[]={0,1,0,-1};
            //traverse neighbours and mark them if it is a land
            for(int k=0; k<4;k++){
                    int nrow=row+delrow[k];
                    int ncol=col+delcol[k];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                    grid[nrow][ncol]=='1' && vis[nrow][ncol]==false){
                        vis[nrow][ncol]=true;
                        q.add(new Pair(nrow, ncol));
                    }  
            }

        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    if(vis[i][j]==false){
                        count++;
                        bfs(i,j,grid,q,vis);
                    }
                }
            }
        }
        return count;
    }
}