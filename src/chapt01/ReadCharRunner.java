package chapt01;

import java.io.*;

public class ReadCharRunner {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);

        try {
            System.out.println("Enter your name and pass: ");
            String name = bis.readLine();
            System.out.println("Hello " + name);
        } catch (java.io.IOException e) {
            System.out.println("Enter error!");
        }
    }
}
