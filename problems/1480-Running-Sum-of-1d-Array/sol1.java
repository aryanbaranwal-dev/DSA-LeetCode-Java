// ==========================================================
// 1480. Running Sum of 1d Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.4 MB (Beats 17%)
// Link       : https://leetcode.com/problems/running-sum-of-1d-array/
// ==========================================================

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum= new int[nums.length];
        runningSum[0] = nums[0];
        for(int i =1; i<nums.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}