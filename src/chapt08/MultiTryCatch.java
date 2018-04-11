package chapt08;

public class MultiTryCatch {
	public static void main(String[] args) {
		try {
			int a = (int) (Math.random() * 2) - 1;
			System.out.println("a= " + a);
			try {
				int b = 1 / a;
				StringBuffer sb = new StringBuffer(a);
			} catch (NegativeArraySizeException e) {
				System.err.println("Недопустимый размер буфера; " + e);
			}
		} catch (ArithmeticException e) {
			System.err.println("Деление на нуль " + e);
		}
	}

}
