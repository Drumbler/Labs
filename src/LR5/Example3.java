package LR5;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int a2 = scanner.nextInt();
        Act arg0 = new Act();
        Act arg1 = new Act(a1);
        Act arg2 = new Act(a1, a2);
    }
    static class Act {
        private int num1, num2;
        Act() {
            System.out.println("Без передачи агрументов: 0");
        }
        Act(int n1) {
            this.num1 = n1;
            System.out.printf("С передачей одного аргумента: %d%n", sum1A1(n1));
        }
        Act(int n1, int n2) {
            this.num1 = n1;
            this.num2 = n2;
            System.out.printf("С передачей двух аргументов: %d%n", sum2A2 (n1, n2));
        }
        private int sum1A1 (int n1) {
            this.num1 = n1;
            return n1 + n1;
        }
        private int sum2A2(int n1, int n2) {
            this.num1 = n1;
            this.num2 = n2;
            return n1 + n2;
        }
    }

}

