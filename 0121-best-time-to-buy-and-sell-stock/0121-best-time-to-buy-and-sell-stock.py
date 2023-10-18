class Solution(object):
    def maxProfit(self, prices):
        minPrice = max(prices) # initialise to maximum price
        maxProfit = 0                
        for price in prices:
            minPrice = min(minPrice, price) # update minimum price to date
            maxProfit = max(maxProfit, price - minPrice) # compare with new minimum
        
        return maxProfit
        