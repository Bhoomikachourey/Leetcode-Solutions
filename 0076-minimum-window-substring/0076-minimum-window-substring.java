class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }
            else{
                map.put(t.charAt(i),1);
            }
        }
        int left=0;
        int right=0;
        int cnt=0;
        while(right<n){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),-1);
            }
            else{
                if(map.get(s.charAt(right))>0) cnt++;
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
            }
            while(cnt==m){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    sIndex=left;
                }
                map.put(s.charAt(left),map.get(s.charAt(left))+1);
                if(map.get(s.charAt(left))>0){
                    cnt--;
                }
                left++;
            }
            right++;
        }
        return sIndex==-1? "":s.substring(sIndex,sIndex+minLen);
    }
}