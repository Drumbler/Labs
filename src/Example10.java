import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 2 числа");
        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println(first - second + "; " + (second + first));
    }
}
