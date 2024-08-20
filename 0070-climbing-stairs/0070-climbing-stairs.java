class Solution {
    public int climbStairs(int n) {
        if( n <= 1){
            return 1;
        }
        int waysToReachPreviousStep = 1;//Ways to reach step 1
        int waysToReachCurrentStep = 1; //ways to reach step 2
        int waysToReachNextStep = 0;
/// Calculate the number of ways to reach each step from 3 to totalSteps
        for(int i = 2;i<=n;i++){
// The number of ways to reach the next step is the sum of the ways
// to reach the current step and the previous step
       waysToReachNextStep = waysToReachPreviousStep + waysToReachCurrentStep;
// Move to the next step: update the values
        waysToReachPreviousStep = waysToReachCurrentStep;
 // Previous step becomes current
        waysToReachCurrentStep = waysToReachNextStep;

        }
        return waysToReachCurrentStep;

        
    }
}
/*
The method contains a single for loop that iterates n-1 times, where n is the number of steps (totalSteps).
The algorithm only uses a fixed amount of extra space, regardless of the input size n.
the space complexity is constant, or O(1).
*/