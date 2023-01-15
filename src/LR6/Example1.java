package LR6;

public class Example1 {

    // Напишите программу с классом, в котором есть два ноля: символьное и текстовое.
// В классе должен быть перегруженный метод для присваивания значений нолям. Если метод
// вызывается с символьным аргументом, то соответствующее значение присваивается
// символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
// значение текстового ноля. Методу аргументом также может передаваться символьный
// массив. Если массив состоит из одного элемента, то он определяет значение символьного
// поля. В противном случае (если в массиве больше одного элемента) из символов массива
// формируется текстовая строка и присваивается значением текстовому полю.
    String str;
    char ch;

    public void setSymbs(char ch){
        this.ch = ch;
    }
    public void setSymbs(String str){
        this.str = str;
    }
    public void setSymbs(char[] chars) {
        if (chars.length == 1){
            this.ch = chars[0];
        } else if (chars.length > 1) {
            this.str = String.valueOf(chars);
        }
    }
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.setSymbs('l');
        example1.setSymbs("Привет");
        System.out.println(example1.ch);
        System.out.println(example1.str);
        char[] chars1 = new char[5];

        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';

        example1.setSymbs(chars1);
        System.out.println(example1.str);
        char[] chars2 = new char[1];

        chars2[0] = 'Ц';
        example1.setSymbs(chars2);

        System.out.println(example1.ch);
    }
}