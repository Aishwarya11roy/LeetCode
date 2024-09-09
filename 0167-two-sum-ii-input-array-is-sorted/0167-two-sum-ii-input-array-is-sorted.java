class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        use 2 pointer technique . one pointer will be on start and another one at the end . Keep checking if the sum of nums[start] + nums[end] > target jus
        decrese the end pouinter . if nums[start] + nums[end] < target just increase start pointer.
        */
        
        int [] arr = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                arr[0] = start + 1;
                arr[1] = end + 1;
                return arr;
            }
            else if(numbers[start] + numbers[end] < target ){
                start += 1;
            }else{
                end = end - 1;
            }
        }
        return arr;
    }
}