package LR5;

public class Example2 {
    private char start = 'A';
    private char finish = 'Z';

    public void printRange() {
        for (char i = start; i <= finish; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Example2 sheesh = new Example2();
        sheesh.printRange();
    }
}
