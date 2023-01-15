package LR6;

public class Example10 {
//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов.
//Результатом метод возвращает массив из двух элементов:
//это значения наибольшего и наименьшего значений среди аргументов, переданных методу.

    public static void main(String[] args) {
        Example10 example101 = new Example10();
        Example10 example102 = new Example10();
        example101.calcMaxMin(1,0,-9,5,25,-101);
        example101.viewMaxMin();
        Example10.calcMaxMin(3,0,500,-2,33,-5,6,17);
        Example10.viewMaxMin();
        example102.calcMaxMin(3,0,50,-2,33,-5,6,17);
        example102.viewMaxMin();
    }
    private static int[] MaxMin;
    private static int[] calcMaxMin(int ... array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        MaxMin = new int[]{max, min};
        return MaxMin;
    }
    private static void viewMaxMin() {
        System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
        System.out.println("MaxiMin[min] = " + MaxMin[1]);
    }
}

