package LR4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int[][] array = new int[row][col];
        Random random = new Random();


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int deleteR = random.nextInt(row);
        int deleteC = random.nextInt(col);

        System.out.println("Удаляем строку номер " + (deleteR + 1));
        System.out.println("Удаляем колонку номер " + (deleteC + 1));

        for (int i = 0; i < row; i++) {
            if (i == deleteR)
                continue;
            for (int j = 0; j < col; j++) {
                if (j == deleteC)
                    continue;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
