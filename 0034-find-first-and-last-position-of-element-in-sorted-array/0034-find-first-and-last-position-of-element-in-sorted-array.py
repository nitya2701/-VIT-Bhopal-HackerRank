class Solution(object):
    def searchRange(self, nums, target):
        first = -1
        last = -1
        
        # Iterate through the list 'nums'.
        for i in range(len(nums)):
            if nums[i] == target:
                # When the target is found, update the 'first' index to the current position.
                first = i
                
                # Continue to find the last occurrence of the target.
                while i < len(nums) and nums[i] == target:
                    i += 1
                
                # Update the 'last' index to the last position where the target was found.
                last = i - 1
                
                # Return the first and last positions as a list and exit the loop.
                return [first, last]
        
        # If the target was not found in the list, return [-1, -1].
        return [first, last]
        