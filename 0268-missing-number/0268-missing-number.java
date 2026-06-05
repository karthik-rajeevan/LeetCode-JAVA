class Solution {
    public int missingNumber(int[] nums) {
        int actualSum=0;
        int n=nums.length;
        int expectedSum=n*(n+1)/2;

        for(int x:nums){
            actualSum = actualSum+x;
        }

        return expectedSum-actualSum;

    }
}