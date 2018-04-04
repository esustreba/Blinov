package chapt07;

public class DemoString {
    static int i;

    public static void main(String[] args) {
        char s[] = {'J', 'a', 'v', 'a'};
        String str = new String(s);
        if (!str.isEmpty()) {
            i = str.length();
            str = str.toUpperCase();
            String num = String.valueOf(8);
            num = str.concat("-" + num);
            char ch = str.charAt(2);
            i = str.lastIndexOf('A');
            num = num.replace("8", "SE");
            str.substring(0, 4);
            str = num + "-8";
            String[] arr = str.split("-");
            for (String ss : arr)
                System.out.println(ss);
        } else {
            System.out.println("String is empty");
        }
    }
}
