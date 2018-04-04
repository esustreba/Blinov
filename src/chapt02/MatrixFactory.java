package chapt02;

public class MatrixFactory {
	public static Matrix createRandomizer(int n, int m) {
		Matrix matrix = new Matrix(n,m);
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix.setElement(i, j, (int) (Math.random()*m*m));
			}
		}
		return matrix;
		
	}

}