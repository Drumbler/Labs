import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название месяца и количество дней");
        String month = scan.next();
        int day = scan.nextInt();
        System.out.println("Месяц " + month + " содержит " + day + " дней");
    }


}
