package LR4;

public class Example7 {
    public static void main(String[] args) {
        int row = 10;
        int col = 10;
        int[][] array = new int[row][col];
        int arr = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][(i % 2 == 0? j : col - 1 - j)] = arr++;

            }
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
