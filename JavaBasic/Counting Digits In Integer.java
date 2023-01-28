// Counting Digits in Integer 



import java.util.Scanner;
public class CountingDigitsInInteger {
    public static void main(String[] args) {
       int n, count=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("\n ----- Number of Digits in the Given Number ----");
     System.out.print("\tEnter Any Number: ");
     n = sc.nextInt();

     while(n>0){
        n=n/10;
        count++;
     }
      System.out.println("\tNumber of Digits: "+count);  
    }
}
