// ==========================================================
// 1929. Concatenation of Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 47 MB (Beats 89%)
// Link       : https://leetcode.com/problems/concatenation-of-array/
// ==========================================================

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int [2 * (nums.length)];
        for(int i = 0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[nums.length + i]=nums[i];
        }
        return ans;
    }
}