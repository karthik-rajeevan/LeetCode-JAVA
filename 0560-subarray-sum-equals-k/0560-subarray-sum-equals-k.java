class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            int currentsum=0;
            for(int j=i;j<nums.length;j++){
                currentsum+=nums[j];
                if(currentsum==k){
                    count++;
                }
            }

        }

        return count;
        

        
    }
}