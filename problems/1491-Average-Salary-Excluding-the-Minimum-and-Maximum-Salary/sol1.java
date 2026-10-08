// ==========================================================
// 1491. Average Salary Excluding the Minimum and Maximum Salary
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.4 MB (Beats 86%)
// Link       : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// ==========================================================

class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i = 0; i<salary.length; i++){
            if(max < salary[i]){
                max = salary[i];
            }
            if(min > salary[i]){
                min = salary[i];
            }
            sum += salary[i];
        }
        sum = sum - min - max;
        double average = sum / (salary.length - 2);
        return average;
    }
}