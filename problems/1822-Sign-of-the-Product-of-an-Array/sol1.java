// ==========================================================
// 1822. Sign of the Product of an Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 26%)
// Memory     : 45 MB (Beats 88%)
// Link       : https://leetcode.com/problems/sign-of-the-product-of-an-array/
// ==========================================================

class Solution {
    public int arraySign(int[] nums) {
        long countNegative = 0;
        for(int i=0; i < nums.length; i++){
        if(nums[i]==0){
            return 0;
        }   
        if(nums[i]<0){
            countNegative++;
        }
    }
        if(countNegative%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}