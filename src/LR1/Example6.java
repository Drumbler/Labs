package LR1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя и год рождения");
        String name = scan.next();
        int age = 2022 - scan.nextInt();

        System.out.println(age>150 || age<0 ? "Ошибка" : "Привет " + name + " тебе " + age + " лет");
    }

}
