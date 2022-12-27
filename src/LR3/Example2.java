package LR3;

import java.util.Scanner;

public class Example2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Введите день недели, с большой буквы!");

            String day = scan.nextLine();

            switch (day) {
                case "Понедельник":
                    System.out.println("1й день недели");
                    break;

                case "Вторник":
                    System.out.println("2й день недели");
                    break;

                case "Среда":
                    System.out.println("3й день недели");
                    break;

                case "Четверг":
                    System.out.println("4й день недели");
                    break;

                case "Пятница":
                    System.out.println("5й день недели");
                    break;

                case "Суббота":
                    System.out.println("6й день недели");
                    break;

                case "Воскресенье":
                    System.out.println("7й день недели");
                    break;

                default:
                    System.out.println("Такого дня недели нет");


            }

        }
}
