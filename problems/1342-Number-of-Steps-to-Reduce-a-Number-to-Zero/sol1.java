// ==========================================================
// 1342. Number of Steps to Reduce a Number to Zero
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.4 MB (Beats 5%)
// Link       : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// ==========================================================

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if(num % 2==0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            count++;
        }
        return count;
    }
}