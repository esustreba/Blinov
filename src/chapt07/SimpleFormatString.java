package chapt07;

import java.util.Formatter;

public class SimpleFormatString {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		f.format("This %s about %n%S %c", "book", "java", '6');
		System.out.println(f);
	}
}
