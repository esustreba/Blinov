package chapt07;

import java.util.*;

public class FormatterDemoTimeAndDate {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		Calendar cal = Calendar.getInstance();

		// 12 hours
		f.format("%tr", cal);
		System.out.println(f);

		// 24 hours
		f = new Formatter();
		f.format("%tc", cal);
		System.out.println(f);

		// current time
		f = new Formatter();
		f.format("%tI:%tM", cal, cal);
		System.out.println(f);

		// all sorts of month
		f = new Formatter();
		f.format("%tB, %tb, %tm", cal, cal, cal);
		System.out.println(f);

	}

}
