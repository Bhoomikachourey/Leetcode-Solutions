class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1=0,w2=0;
        int l1=0,l2=0;
        while(w1<word1.length && w2<word2.length){
            if(word1[w1].charAt(l1)!=word2[w2].charAt(l2)){
                return false;
            }
            l1++;
            l2++;
            if(l1==word1[w1].length()){
                l1=0;
                w1++;
            }
            if(l2==word2[w2].length()){
                l2=0;
                w2++;
            }
        }
        return w1==word1.length && w2==word2.length;
    }
}