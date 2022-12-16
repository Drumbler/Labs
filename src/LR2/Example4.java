package LR2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число, которое входит в диапазон от 5 до 10: ");
        int num = scan.nextInt();

        if  (num >= 5 & num <= 10)
            System.out.println("Число входит в диапазон");
        else
            System.out.println("Число не входит в диапазон");

    }
}
