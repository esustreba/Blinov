package chapt14;

public class Runner {
    public static void main(String[] args) {
        Blocked lock = new Blocked();
        new Thread() {
            public void run() {
                lock.doWait();
            }
        }.start();
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            lock.setI(lock.getI() + 2);
            System.out.print("преумножай ");
            lock.notify();
        }
        synchronized (lock) {
            lock.setI(lock.getI() + 3);
            System.out.print("необходимого ");
            try {
                lock.wait(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("=" + lock.getI());
    }
}
