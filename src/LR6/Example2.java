package LR6;

public class Example2 {
    private static int zero = 0;


    public static void inc(){
        System.out.println(zero);
        zero ++;
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.inc();
        example2.inc();
        example2.inc();
        example2.inc();
        example2.inc();
        example2.inc();


    }
}

// Напишите программу с классом, в котором есть закрытое статическое
// целочисленное ноле с начальным нулевым значением. В классе должен быть описан
// статический метод, при вызове которого отображается текущее значение статического
// поля, после чего значение поля увеличивается на единицу.