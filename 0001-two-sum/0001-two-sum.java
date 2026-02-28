class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> x = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(x.containsKey(complement)){
                return new int[]{x.get(complement),i};
            }
            x.put(nums[i],i);
        }
        return new int[0];

        
    }
}