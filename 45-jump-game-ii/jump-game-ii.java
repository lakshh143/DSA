class Solution {
    public int jump(int[] nums) {
        int max=0,jumps=0,curr=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==curr){
                jumps++;
                curr=max;
            }
        }
        return jumps;
    }
}