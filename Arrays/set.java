  class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing=-1; 
        int duplicate=-1;
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
             if(nums[index ]<0)
            {
                duplicate= Math.abs(nums[i ]);
            }
            if(nums[index]>0)
            {
                nums[index]=-nums[index];
            }
            
        }
        for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        {
       missing=i+1;
        }
       }
        
       return new int[]{duplicate,missing};
        
    }  
}