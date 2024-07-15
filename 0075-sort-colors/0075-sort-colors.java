class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0,count1 = 0,count2 = 0;

        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0){
                count0++;

            }else if (nums[i] == 1){
                count1++;

            }else{
                count2++;

            }
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);

         for(int i = 0; i<count0;i++){
            nums[i] = 0;
         }
          System.out.println(Arrays.toString(nums));
         for(int i = count0;i <count0+count1;i++){
            nums[i] = 1;
         }
         System.out.println(Arrays.toString(nums));
         for (int i = count0+count1; i<nums.length;i++){
            nums[i] = 2;
         }
     
        
    }
}