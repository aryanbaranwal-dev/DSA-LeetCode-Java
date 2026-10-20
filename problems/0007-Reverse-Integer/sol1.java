// ==========================================================
// 7. Reverse Integer
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 9%)
// Memory     : 42 MB (Beats 97%)
// Link       : https://leetcode.com/problems/reverse-integer/
// ==========================================================

class Solution {
    public int reverse(int x) {
        int num = 0;
        int revNum = 0;
        while(x != 0){
            num = x % 10;
            if((revNum > Integer.MAX_VALUE/10 || (revNum == Integer.MAX_VALUE/10 && num > 7))||(revNum < Integer.MIN_VALUE/10 || (revNum == Integer.MIN_VALUE/10 && num < -8))){
                return 0;
            }
            revNum = revNum * 10 + num;
            x /= 10;
        }
        return revNum;
    }
}