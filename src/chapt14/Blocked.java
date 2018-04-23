package chapt14;

public class Blocked {
    private int i = 1000;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public synchronized void doWait() {
        try {
            System.out.print("He ");
            this.wait();
            System.out.print("сущностей ");
            Thread.sleep(50);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < 5; j ++) i/=5;
        System.out.print("сверх ");
    }
}
