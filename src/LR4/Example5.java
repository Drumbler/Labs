package LR4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
     int row = 3, col = 5;
      int [][] array = new int[row][col];
      Random random = new Random();
        System.out.println("Изначальный массив:");
      for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++){
              array[i][j] = random.nextInt(10);
              System.out.print(array[i][j] + " ");
          }
          System.out.println();
      }
        System.out.println("Измененный массив:");
      for (int i = 0; i < col; i++){
          for (int j = 0; j < row; j++){
              System.out.print(array[j][i] + " ");
          }
          System.out.println();
      }

    }

}
