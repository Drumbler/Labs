package LR3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num0 = 1;
        int num1 = 1;
        int num2;

        System.out.println("Введите длину последовательности");
        int len = scan.nextInt();
        System.out.print(num0 + " " + num1 + " ");

        for (int i = 3; i <= len; i++) {
            num2 = num0+num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;




        }




        }
    }
