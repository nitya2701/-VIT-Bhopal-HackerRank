class Solution(object):
    def isPowerOfFour(self, n):
        if n<=0:
            return False
        x=math.log(n,4)
        return x==int(x)