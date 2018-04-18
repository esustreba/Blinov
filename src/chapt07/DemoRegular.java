package chapt07;
import java.util.regex.*;

public class DemoRegular {
	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("a+y");
		Matcher m1 = p1.matcher("aaay");
		boolean b = m1.matches();
		System.out.println(b);
		String regex = "(\\w)@(\\w+\\.)(\\w+)(\\.\\w+)*";
		String s = "email address: mymail@tit.co and neg@i.ua";
		
		Pattern p2 = Pattern.compile(regex);
		Matcher m2 = p2.matcher(s);
		while(m2.find()) 
			System.out.println("email: " + m2.group());
		
		Pattern p3 = Pattern.compile("\\d+\\s?");
		String[] words = p3.split("java5tiger 77 java6mustang");
		
		for(String word : words)
			System.out.println(word);
	}

}
