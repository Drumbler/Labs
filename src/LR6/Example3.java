package LR6;

public class Example3 {
        static void calcMax(int ... array){
            int max = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Maximum array[] = "+max);
        }
        static void calcMin(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Minimum array[] = "+min);

        }
        static void calcAvg(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Average array[] = "+avg);
        }

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        example3.calcMax(1,0,-9,5,25,-101);
        example3.calcMin(3,0,500,-2,33,-5,6,17);
        example3.calcAvg(3,0,50,-2,33,-5,6,17);
    }
}
