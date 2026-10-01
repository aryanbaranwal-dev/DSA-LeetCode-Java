// ==========================================================
// 412. Fizz Buzz
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 47 MB (Beats 11%)
// Link       : https://leetcode.com/problems/fizz-buzz/
// ==========================================================

class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> result = new ArrayList<>();
         for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}