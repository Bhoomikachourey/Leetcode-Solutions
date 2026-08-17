class Solution {
    private static void dfs(ArrayList<ArrayList<Integer>> adj,int node, boolean vis[]){
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(adj,it,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean vis[]=new boolean[v];
        //change from matrix to adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        for(int i=0;i<v;i++){
            if(vis[i]==false){
                count++;
                dfs(adj,i,vis);
            }
        }
        return count;
    }
}