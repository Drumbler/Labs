package LR4;
import java.util.Scanner;
public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String message = in.nextLine();
        char[] messageArray = message.toCharArray();
        int key = 0;
            try {
                System.out.println("Введите ключ:");
                key = Integer.parseInt(in.nextLine());
            }
            catch (NumberFormatException e) {

            }

            for (int i = 0; i < messageArray.length; i++) {
                System.out.print((char) (messageArray[i] + key));
                }
            System.out.println();
            System.out.println("Выполнить обратное преобразование? (y/n)");
            while (true) {
                switch (in.nextLine()) {
                    case "y" -> {
                        System.out.println(message);
                        return;
                    }
                    case "n" -> {
                        System.out.println("До свидания!");
                        return;
                    }
                    default -> System.out.println("Введите корректный ответ");
                }
            }
    }
}








