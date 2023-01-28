// Java Programm to check whether the year is leap or not??

import java.util.Scanner;
// coded by Satyam Raj 
class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("\n\n**************************************************************\n");
        System.out.println("\tThis Programm is for checking whether \n\t the current year is Leap or Not...?\n\n");
        System.out.print("Enter the Year: ");
        year = sc.nextInt();

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0) ))
        System.out.println("The year "+year+" is a Leap Year\n");
        else
            System.out.println("The year "+year+" is not a Leap Year\n"); 
    }
}

