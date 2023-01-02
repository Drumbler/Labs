package LR3;
import java.util.Arrays;
import java.util.Random;

public class Example9 {
        public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(50);
            }

            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.print("Наименьшее число: " + array[0] + " индекс чисел: " + 0);
            int i = 0;
            while (i < array.length - 1 && array[i] == array[i + 1]) {
                System.out.print(" " + (i + 1));
                i++;
            }
        }
    }
