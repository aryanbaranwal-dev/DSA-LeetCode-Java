// ==========================================================
// 1518. Water Bottles
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.3 MB (Beats 19%)
// Link       : https://leetcode.com/problems/water-bottles/
// ==========================================================

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        int empty=0;
        while(numBottles>=numExchange){
        max += (numBottles / numExchange);
        empty = (numBottles/numExchange) + (numBottles % numExchange);
        numBottles= empty;
        }
        return max;
    }
}