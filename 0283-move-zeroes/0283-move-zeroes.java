class Solution {
    public void moveZeroes(int[] arr) {
        int j=0;
        int n=arr.length;

        while (j<n){
            if(arr[j]==0){
                break;
            }
            j++;
        }
        if(j!=-1){
        int i=j+1;
        while (i<n){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
    }
    }
}