// ==========================================================
// 258. Add Digits
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 3%)
// Memory     : 42.2 MB (Beats 95%)
// Link       : https://leetcode.com/problems/add-digits/
// ==========================================================

class Solution {
    public int addDigits(int num) {
        int n;
        while(num > 9){
        int sum = 0;
        while(num != 0){
            n = num % 10;
            sum += n;
            num /= 10;
        }
        num = sum;
        }
        return num;
    }
}