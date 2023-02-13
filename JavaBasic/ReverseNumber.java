/* 
 * Problem 2.
      Reverse a Number 
      n = 3671 
      o/p : 1763 
 */

public class Reverse_Number {
     public static void main(String[] args) {
                 int number = 3671, reverse = 0;
                          while (number != 0) {
                            int remainder = number % 10;
                            reverse = reverse * 10 + remainder;
                            number = number / 10; }
 System.out.println("The reverse of the given number is: " + reverse);
  }
 } 