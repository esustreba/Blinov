package chapt07;

public class DemoStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Длинна ==> " + sb.length());
		System.out.println("Размер ==> " + sb.capacity());
		// sb = "Java"; - error!
		sb.append("Java");
		System.out.println("Строка ==> " + sb);
		System.out.println("Длина ==> " + sb.length());
		System.out.println("Рамзер ==> " + sb.capacity());
		System.out.println("Реверс ==> " + sb.reverse());
	}

}	
