class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[]=new int[26];
        boolean visited[]=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(visited[ch-'a']){
                continue;
            }
            while(!stack.isEmpty() && freq[stack.peek()-'a']>0 && stack.peek()>ch){
                visited[stack.pop()-'a']=false;
            }
            visited[ch-'a']=true;
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}