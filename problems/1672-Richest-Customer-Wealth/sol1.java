// ==========================================================
// 1672. Richest Customer Wealth
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.8 MB (Beats 99%)
// Link       : https://leetcode.com/problems/richest-customer-wealth/
// ==========================================================

class Solution {
    public int maximumWealth(int[][] accounts) {
        int newSum = 0;
        for(int i = 0; i < accounts.length; i++){
            int currSum =0;
            for(int j =0; j<accounts[i].length; j++){
                currSum = currSum + accounts[i][j];
            }
            if (currSum > newSum){
                newSum = currSum;
            }
        }
        return newSum;
    }
}