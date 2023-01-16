package TIMUS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Task1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s=bufferedReader.readLine();
        int a=Integer.parseInt(s.split(" ")[0]);
        int b=Integer.parseInt(s.split(" ")[1]);
        PrintWriter writer= new PrintWriter(System.out);
        writer.write(a+b+"");
        writer.flush();
        writer.close();
    }
}

