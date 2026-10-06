// ==========================================================
// 1281. Subtract the Product and Sum of Digits of an Integer
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.1 MB (Beats 46%)
// Link       : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// ==========================================================

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n != 0){
            int num = n % 10;
            n /= 10;
            product *= num;
            sum += num;
        }
        return (product - sum);
    }
}