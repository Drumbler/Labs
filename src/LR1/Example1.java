package LR1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Введите вашу фамилию");
        String fam = scan.nextLine();

        System.out.println("Теперь введите имя");
        String fName = scan.nextLine();

        System.out.println("И наконец ваше отчество");
        String sName = scan.nextLine();

        System.out.println("hello " + fam + " " + fName + " " + sName);

        scan.close();
    }


}
