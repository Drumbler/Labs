package LR4;

public class Example3 {
    public static void main(String[] args) {

        int [][] twoDimArray = new int[11][23];
        for (int i = 0; i < twoDimArray.length; i++){
            System.out.println();
         for (int j = 0; j < twoDimArray[0].length; j++){
             if ((i+j) % 2 == 0){
                 twoDimArray[i][j] = 1;
             System.out.print(twoDimArray[i][j] + " ");
             }
             else {
                 twoDimArray[i][j] = 2;
                 System.out.print(twoDimArray[i][j] + " ");
             }

         }
        }
    }
}
