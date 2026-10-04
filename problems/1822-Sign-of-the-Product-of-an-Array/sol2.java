// ==========================================================
// 1822. Sign of the Product of an Array
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 26%)
// Memory     : 45.2 MB (Beats 57%)
// Link       : https://leetcode.com/problems/sign-of-the-product-of-an-array/
// ==========================================================

class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i=0; i < nums.length; i++){
        if(nums[i]==0){
            return 0;
        }   
        if(nums[i]<0){
            sign = -sign;
        }
    }
    return sign;
    }
}