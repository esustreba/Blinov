package chapt14;

class Th extends Thread {
    public Th(String str){
        super();
        setName(str);
    }
    public void run() {
        String nameT = getName();
        System.out.println("Start thread " + nameT);
        if("First".equals(nameT)) {
            try {
                sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Close thread " + nameT);
        } else if ("Second".equals(nameT)) {
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Close thread " + nameT);
        }
    }
}

public class JoinRunner {
    public static void main(String[] args) {
        Th tr1 = new Th("First");
        Th tr2 = new Th("Second");
        tr1.start();
        tr2.start();
        try{
            tr1.join();
            System.out.println("close main thread");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}