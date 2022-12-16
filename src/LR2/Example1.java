package LR2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число: ");

        int num = scan.nextInt();

        if (num % 3 == 0 )
            System.out.println(num + " делится на 3");
         else
            System.out.println(num + " Не делится на 3");
    }

}
