package LR5;

import java.util.Scanner;

public class Example1 {
    static Scanner scan = new Scanner(System.in);
    private static char symbol;

    public static void main(String[] args) {
        System.out.println("Список доступных команд: \n" +
                "setSymb - для установки символа \n" +
                "code - возвращает номер символа \n" +
                "codeSymb - возвращает символ и код символа");
        Example1 act = new Example1();
        while (true) {

            switch (scan.nextLine()) {
                case "setSymb":
                    symbol=setSymb();
                    break;

                case "code":
                    code(symbol);
                    break;

                case  "codeSymb":
                    codeSymb(symbol);
                    break;

                default:
                    System.out.println("Список доступных команд: \n" +
                            "setSymb - для установки символа \n" +
                            "code - возвращает номер символа \n" +
                            "codeSymb - возвращает символ и код символа");
                    break;

            }
        }
    }

    public static char setSymb() {
        return scan.next().charAt(0);
    }

    public static void code(char code1) {
        System.out.println((int) code1);
        return;
    }

    public static void codeSymb(char code1) {
        System.out.println(code1 + " " +(int) code1);
        return;
    }

}


