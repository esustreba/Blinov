package chapt07;

import java.text.Normalizer.Form;
import java.util.*;

public class FormatterDemoFlags {
	public static void main(String[] args) {
		Formatter f = new Formatter();

		f.format("|%10.2f|", 123.123);
		System.out.println(f);

		f = new Formatter();
		f.format("|%-10.2f|", 123.123);
		System.out.println(f);

		f = new Formatter();
		f.format("% (d", -100);
		System.out.println(f);

		f = new Formatter();
		f.format("%,.2f", 123456789.34);
		System.out.println(f);

		f = new Formatter();
		f.format("%.16s", "Now I know class java.util.Formatter");
		System.out.println(f);
	}

}
