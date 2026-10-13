class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0,rsum=0,maxSum=0,n=nums.length;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }
        maxSum=lsum;
        int rgtIdx=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=nums[i];
            rsum+=nums[rgtIdx];
            rgtIdx--;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}