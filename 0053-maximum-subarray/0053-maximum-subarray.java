class Solution {
    public int maxSubArray(int[] nums) {
        int maxval=Integer.MIN_VALUE; //tracking the most possible sum by first assigning the least possible value
        int cursum=0; //tracking the current sum
        for(int num : nums){
            cursum+=num;
            if(cursum>maxval){
                maxval=cursum;
            }
            if(cursum<0){
                cursum=0;
            }

        }
        return maxval;
        
    
    }
}