# python code


class Solution(object):
    def isPalindrome(self, x):
        s=0
        total=x
        if(x>0):
            while (x!=0):
                s=s*10+x%10
                x=int(x/10)
        elif(x<0):
            total=-total
            while (-x!=0):
                s=s*10-x%10
                x=int(-x/10)
                
        if(s==total):
            return True
            
        else:
            return False
        
        """
        :type x: int
        :rtype: bool
        """
        
