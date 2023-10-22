class Solution {
    public int maximumScore(int[] nums, int k) {
int score = nums[k];
int min = nums[k];
int low=k, high=k, n=nums.length;

    while(low>0 || high<(n-1)){
        if((low>0?nums[low-1]:0) < (high<(n-1)?nums[high+1]:0)){
            high++;
        } else{
            low--;
        }

        min = Math.min(min, Math.min(nums[high], nums[low]));
        score = Math.max(score, (high-low+1)*min);
    }

    return score;
    }
}