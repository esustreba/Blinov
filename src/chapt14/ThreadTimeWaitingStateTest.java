package chapt14;

public class ThreadTimeWaitingStateTest extends Thread {
    public void run() {
        try {
            Thread.sleep(50);
        }catch (InterruptedException e) {
            System.err.print("Thread error");
        }
    }

    public static void main(String[] args) {
        try{
            Thread thread = new ThreadTimeWaitingStateTest();
            System.out.println("1: " + thread.getState());
            thread.start();
            System.out.println("2: " +thread.getState());
            thread.sleep(10);
            System.out.println("3: " + thread.getState());
            thread.join();
            System.out.println("4: " + thread.getState());
        }catch (InterruptedException e) {
            System.err.print("Thread error");
        }
    }
}
