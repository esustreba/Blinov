package chapt08;

public class TwoException {
	public static void main(String[] args) {
		try {
			int a = (int) (Math.random() * 2);
			System.out.println("a= " + a);
			int c[] = { 1 / a };
			c[a] = 71;
		} catch (ArithmeticException e) {
			System.err.println("Деление на нуль" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Выход за границы массива " + e);
		}

		System.out.println("После блока try-catch");
	}

}
