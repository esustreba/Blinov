package chapt10;

public class DemoSecurity {
    public static void main(String[] args) {
        CheckRight.startUsing(2041, "Artem");
        CheckRight.startUsing(2420, "Yaroslav");
        CheckRight.startUsing(2437, "Anastasia");
        CheckRight.startUsing(2041, "Artem");
    }
}
