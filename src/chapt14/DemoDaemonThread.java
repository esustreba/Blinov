package chapt14;

class T extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Start daemon-thread");
                sleep(1);
            } else {
                System.out.println("Start usual thread");
            }
        } catch (InterruptedException e) {
            System.err.println("Error " + e);
        } finally {
            if (!isDaemon())
                System.out.println("Close usual thread");
            else
                System.out.println("Close daemon-thread");
        }
    }
}

public class DemoDaemonThread {
    public static void main(String[] args) {
        T usual = new T();
        T daemon = new T();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("Last operator main");
    }
}
