package LR3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int i;


/*

         if (num1 > num2)
            while (num1 >= num2) {
                System.out.print(num2 + " ");
                num2++;
            }
        else
            while (num1 <= num2) {
                System.out.print(num1+ " ");
                num1++;


            }

 */

        if (num1 > num2)
            while (num1 >= num2) {
                System.out.print(num2 + " ");
                num2++;
            }
        else
            while (num1 <= num2) {
                System.out.print(num1+ " ");
                num1++;


            }

    }
}






