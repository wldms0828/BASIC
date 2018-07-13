package step4;

public class MatrixBasic4_Diamond {
	public static void main(String[] args) {
		int k = 0;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				for (int j = 2; j < 3; j++) {
					k++;
					mtx[i][j] = k;
				}
			} else if (i == 2) {
				for (int j = 0; j < 5; j++) {
					k++;
					mtx[i][j] = k;
				}
			} else {
				for (int j = 1; j <= 3; j++) {
					k++;
					mtx[i][j] = k;
				}
			}

			System.out.print("\n");
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d.", mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
