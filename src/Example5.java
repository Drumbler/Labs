
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Введите год рождения");
            int age = 2022 - scan.nextInt();
          /*  if(age>150 || age<0) {
                System.out.println("Ошибка");
            } else {
                System.out.println("Ваш возраст: " + age);
            }*/
        System.out.println(age>150 || age<0 ? "Ошибка" : "Ваш возвраст: " + age);

    }
}
