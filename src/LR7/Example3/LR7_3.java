package LR7.Example3;

public class LR7_3 {
    public static void main(String[] args) {
        SupClass1 superClassTest = new SupClass1(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SubClass2 FirstSubClassTest = new SubClass2(1024,'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        SubClass3 SecondSubClassTest = new SubClass3(1024,'K',"кибибайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        }
    }

