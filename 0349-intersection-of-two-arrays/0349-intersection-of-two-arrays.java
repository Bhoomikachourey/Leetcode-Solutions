class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=-1;
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(i<n1 && j<n2){
            if((al.isEmpty() || al.get(k)!=nums1[i]) && nums1[i]==nums2[j] ){
                al.add(nums1[i]);
                i++;
                j++;
                k++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int arr[]=new int[al.size()];
        for(int m=0;m<al.size();m++){
            arr[m]=al.get(m);
        }
        return arr;
    }
}