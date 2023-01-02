package LR3;

public class Example7 {

        public static void main(String[] args) {
            char[] array = new char[10];
            char num = 'a';
            for (int i = 0; i <= 9; i++, num++) {
                array[i] = num++;
            }
            for (int i = 0; i <= 9; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            for (int i = 9; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }

