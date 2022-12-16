package LR1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = 2022 - scan.nextInt();
        System.out.println(age>2022 || age<1872 ? "Ошибка" : "Год рождения: " + age);
    }
}
