// ==========================================================
// 2469. Convert the Temperature
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.1 MB (Beats 40%)
// Link       : https://leetcode.com/problems/convert-the-temperature/
// ==========================================================

class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double arr[] = new double[2];
        arr[0] = Kelvin; 
        arr[1] = Fahrenheit;
        return arr;
    }
}