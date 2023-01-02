package LR3;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 2 числа");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (((num1 % 5 == 2) | (num1 % 3 == 1)) && ((num2 % 5 == 2) | (num2 % 3 == 1))) {
            System.out.println("Сумма = " + (num1 + num2));

        }
        else
            System.out.println("Одно из чисел не удовлетворяет условиям");
    }


}
