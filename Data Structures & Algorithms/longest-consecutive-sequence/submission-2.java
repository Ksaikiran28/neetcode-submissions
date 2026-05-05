class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n==0) return 0;
        int longest = 1;
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                if(nums[i+1] - nums[i] == 1){
                    count++;
                }else{
                    longest = Math.max(longest,count);
                    count=1;
                }
            }
            
        }
        return Math.max(longest,count);
    }
}
