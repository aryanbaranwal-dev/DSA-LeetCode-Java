// ==========================================================
// 9. Palindrome Number
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 5 ms (Beats 85%)
// Memory     : 46.2 MB (Beats 17%)
// Link       : https://leetcode.com/problems/palindrome-number/
// ==========================================================

class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int num=0;
        if(x < 0){
            return false;
        }
        while(x != 0){
            num = (num *10)+ (x % 10);
            x /= 10;
        }
        return (original == num);
    }
}