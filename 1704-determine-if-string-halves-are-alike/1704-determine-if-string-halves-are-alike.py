class Solution(object):
    def halvesAreAlike(self, s):
        left=0
        right=0
        for i in range(len(s)//2):
            if s[i] in 'aeiouAEIOU':
                left+=1
            if s[-i-1] in 'aeiouAEIOU':
                right+=1
            
        return left==right

        