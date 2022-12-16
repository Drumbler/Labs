package LR1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введи число");
         float num = scan.nextFloat();

        System.out.println(num - 1.0 + "; " + num + "; " + (num + 1.0) + "; " + Math.sqrt(num * 3));

    }
}
