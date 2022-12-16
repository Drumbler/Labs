package LR2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = scan.nextInt();
        if (num >= 10 & num % 4 == 0)
        System.out.println("Число удовлетворяет условиям");

        else
            System.out.println("Число не удовлетворяет условиям");


    }
}
