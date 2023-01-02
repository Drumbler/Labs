package LR3;
import java.util.Arrays;
import java.util.Random;

public class Example10 {

        public static void main(String[] args) {
            int[] array = new int[20];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(500);
            }
            Arrays.sort(array);
            int temp;
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }
    }

