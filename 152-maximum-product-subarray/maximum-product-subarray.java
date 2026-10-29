class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=-1000000;
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=nums[i];
            max=Math.max(max,ans);
            if(ans==0)ans=1;
        }
        ans=1;
        int max1=-1000000;
        for(int i=n-1;i>=0;i--){
            ans*=nums[i];
            max1=Math.max(max1,ans);
             if(ans==0)ans=1;
        }
        return Math.max(max,max1);
    }
}