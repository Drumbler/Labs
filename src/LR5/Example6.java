package LR5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example6 {
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    public Example6(int n1, int n2) {
        comparison(n1, n2);
    }
    public Example6(int n) {
        comparison(n);
    }

    public void comparison(int n1, int n2) {
        this.min = Math.min(n2, Math.min(min, n1));
        this.max = Math.max(n2, Math.max(max, n1));
    }


    public void comparison(int n) {
        min = Math.min(min, n);
        max = Math.max(max, n);
    }

    public void printNums() {
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }


    public static void main(String[] args) {
        Example6 example6 = new Example6(2, 5);
        //  Scanner scan = new Scanner(System.in);
        example6.comparison(20, 5);
        example6.printNums();
        Example6 example61 = new Example6(50);
        example61.comparison(20, -9);
        example61.printNums();

    }
}