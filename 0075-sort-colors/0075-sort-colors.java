class Solution {
    public void sortColors(int[] nums) { //also try Dutch national flag algorithm
        
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int num : nums){
            if(num==0){
                zeros=zeros+1;
            }
            else if(num==1){
                ones=ones+1;

            }
            else{
                twos=twos+1;
            }
        }
        int i=0;
        while(zeros>0){
            nums[i]=0;
            i++;
            zeros=zeros-1;
        }
        while(ones>0){
            nums[i]=1;
            i++;
            ones=ones-1;
        }
        while(twos>0){
            nums[i]=2;
            i++;
            twos=twos-1;

    }
    
}
}