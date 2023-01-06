/*
 * //q18 Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 */



public class factorialWithTrailingZeroes {
    
        public int trailingZeroes(int n) {
       if(n==0){
           return 0;
       }
       return n/5 + trailingZeroes(n/5);
       }
   
}
