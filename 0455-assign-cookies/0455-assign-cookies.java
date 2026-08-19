class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);
        int l=0;
        int r=0;
        int n=children.length;
        int m=cookies.length;
        while (l<n && r<m){
            if(cookies[r]>=children[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}