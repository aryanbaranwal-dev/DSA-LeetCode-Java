// ==========================================================
// 1480. Running Sum of 1d Array
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.3 MB (Beats 54%)
// Link       : https://leetcode.com/problems/running-sum-of-1d-array/
// ==========================================================

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}