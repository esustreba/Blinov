package chapt14;

import java.io.IOException;

public class SynchroThreads {
    public static void main(String[] args) {
        try {
            try {
                Synchro s = new Synchro("data.txt");

                MyThread t1 = new MyThread("First", s);
                MyThread t2 = new MyThread("Second", s);
                t1.start();
                t2.start();
                t1.join();
                t2.join();
                s.close();
                } catch (InterruptedException e) {
                System.err.print("File error");
                    e.printStackTrace();
                }
                } catch (IOException e) {
            System.err.print("Thread error");
                e.printStackTrace();
            }
        }
    }

