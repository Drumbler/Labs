package LR5;

public class Example4 {
    public static void main(String[] args) {

        Act arg2 = new Act(12, 'A');
        Act arg1 = new Act(65.1267);
    }
    static class Act {
        private char symb;
        private int num;
        Act(int i, char c) {
            this.symb = c;
            this.num = i;
            int length = (int) (Math.log10(num) + 1);
            double result = (double) symb + (double) num * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) symb + "; int = " + length + "\n");
        }
        Act(double d) {
            char symb = (char) d;
            num = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + symb + "; int = " + num + "\n");
        }
    }
}
