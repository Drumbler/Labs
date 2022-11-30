import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите день недели");
        String dayOfWeek = scan.nextLine();

        System.out.println("Введите месяц");
        String month = scan.nextLine();

        System.out.println("Введите дату(число)");
        int day = scan.nextByte();


        System.out.println(dayOfWeek + " " + day + " " + month);
    }
}
