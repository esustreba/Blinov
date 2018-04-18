package chapt14;

public class Talk extends Thread {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

    }
}
