class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        int dp[]=new int[nums.length+1];
        
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
    if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        
        dp[0]=0;
        dp[1]=nums[0];
        dp[2]=Math.max(dp[0]+nums[1],nums[0]);
        
        for(int i=3;i<=nums.length;i++){
            
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        
        return dp[nums.length];
        
    }
}