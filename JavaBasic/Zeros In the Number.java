// Write A Java Programm to Count the Number of Zeros in the Given Number ......

import java.util.Scanner;
class ZeroInNumber{
    public static void main(String[] args) {
        Long a, b, num;
        int count = 0;
        System.out.println("******************************");
        System.out.println("------- Number of Zeros in the Given Number --------");
        System.out.print("\nEnter The Number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        num = a;
        while (a > 0) {
            b = a % 10;
            if (b == 0) {
                count++;
            }
            a = (Long) (a / 10);
        }
        System.out.println("The number of zeros in " + num + " are " + count);
    }

}

