package chapt14;

public class WalkTalk {
    public static void main(String[] args) {
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();
    }
}
