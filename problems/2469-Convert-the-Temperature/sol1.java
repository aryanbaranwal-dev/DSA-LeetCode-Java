// ==========================================================
// 2469. Convert the Temperature
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 0%)
// Memory     : 45.9 MB (Beats 87%)
// Link       : https://leetcode.com/problems/convert-the-temperature/
// ==========================================================

class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double arr[] = new double[2];
          arr[0] = Kelvin; 
          arr[1] = Fahrenheit;
          for(int i =0; i<2; i++){
          System.out.print(arr[i]);
          }
          return arr;
    }
}