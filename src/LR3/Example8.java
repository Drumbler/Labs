package LR3;

public class Example8 {
    public static void main(String[] args) {

        int ar = 10, i = 0, j = 0;


        char[] aArray = new char[ar];
        char[] bArray = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};

        char b = 'A';


        for (i = 0; i < ar; i++) {
            Boolean s = true;

            for (j = 0; j < bArray.length; j++) {
                if (b == bArray[j]) {
                    i--;
                    s = false;
                    break;
                }
            }
            if (s) {
                aArray[i] = b;
            }
            b++;
        }

        for (int n = 0; n < ar; n++) {
            System.out.print(aArray[n] + "\t");
        }
    }
}
