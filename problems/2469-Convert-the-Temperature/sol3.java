// ==========================================================
// 2469. Convert the Temperature
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46 MB (Beats 76%)
// Link       : https://leetcode.com/problems/convert-the-temperature/
// ==========================================================

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{
            celsius + 273.15, 
            celsius * 1.80 +32
        };
    }
}