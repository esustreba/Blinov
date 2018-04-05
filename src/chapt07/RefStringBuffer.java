package chapt07;

public class RefStringBuffer {
	public static void changeStr(StringBuffer s) {
		s.append(" Microsystem");
	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Sun");
		changeStr(str);
		System.out.println(str);
	}
}
