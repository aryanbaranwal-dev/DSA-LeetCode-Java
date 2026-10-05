// ==========================================================
// 1523. Count Odd Numbers in an Interval Range
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.1 MB (Beats 43%)
// Link       : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// ==========================================================

class Solution {
    public int countOdds(int low, int high) {
        return (((high+1)/2) - low/2) ;
    }
}