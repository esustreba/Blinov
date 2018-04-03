package chapter2;

public class Runner {
	public static void main(String[] args) {
		int n = 2, m = 3, l = 4;
		Matrix p = MatrixFactory.createRandomizer(n, m);
		Matrix q = MatrixFactory.createRandomizer(m, l);
			System.out.println("Matrix first is : " + p);
			System.out.println("Matrix second is :" + q);
			
			try {
				Matrix result = Multiplicator.multiply(p, q);
				System.out.println("Matrix product is : " + result);
			} catch (MultipleException e) {
				System.err.println("Matrices could" + " not be multipled: " );
			}				
	}
}
