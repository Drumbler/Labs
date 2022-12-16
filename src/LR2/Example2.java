package LR2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        if (num % 5 == 2)
            System.out.println("Делится с остатком 2 при делении на 5");
         else
            System.out.println("Не делится с остатком 2 при делении на 5");
        if (num % 7 == 1)
            System.out.println("Делится с остатком 1 при делении на 7 ");
         else
            System.out.println("Не делится с остатком 1 при делении на 7");


    }


}
