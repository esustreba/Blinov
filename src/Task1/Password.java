package Task1;
import java.util.*;
public class Password {
    static String password = "123456";
    static String yourPassword;
    static String enterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        yourPassword = scanner.nextLine();
        System.out.println("Your password " + yourPassword);
        return yourPassword;
    }

    static void comparePassword () {
        if (password.equals(yourPassword))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        enterPassword();
        comparePassword();
    }
}
