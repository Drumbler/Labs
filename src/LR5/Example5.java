package LR5;

import java.util.Scanner;
public class Example5 {
    private int num;

    public int printNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num=num;
        if (num>+100){
            this.num = 100;
        }
        else if (num<=0) {
            this.num = 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Example5 example5 = new Example5();

        example5.setNum(scan.nextInt());
        System.out.println(example5.printNum());
    }
}
