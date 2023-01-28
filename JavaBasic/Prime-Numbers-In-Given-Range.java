// Write A java Programm to print all the prime numbers in the Given Range 
// Range is taken through the user input

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i,j;
        System.out.println("\n*************************************\n\n");
        System.out.println("::::: Prime Numbers In a given Range ::::\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Lower Limit of Range : ");
        int start = sc.nextInt();
        System.out.print("Enter the Upper Limit of Range : ");
        int end = sc.nextInt();
        System.out.println("\nPrime Numbers in the range from "+start+" to "+end+" is given Below: ");

        for (i = start; i < end;i++ ){
            for(j =2;j<=i;j++){
                if(i%j == 0)
                break;
            }
            if(i==j)
            System.out.print(j+" ");
        }

    }
    
}
// coded by satyamraj 
