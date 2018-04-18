package chapt14;

public class YieldRunner {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("Start thread 1");
                Thread.yield();
                System.out.println("close 1");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("Start thread 2");
                System.out.println("close 2");
            }
        }.start();
    }
}
