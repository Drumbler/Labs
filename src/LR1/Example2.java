package LR1;

import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Введите имя");
        String fName = scan.nextLine();

        System.out.println("Введите возраст");


        System.out.println(fName + " " + scan.nextInt());

        scan.close();
    }
}

