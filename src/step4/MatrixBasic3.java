package step4;
/**
 * 우에서 좌로 역방향 코딩!
 * * */

public class MatrixBasic3 {
	public static void main(String[] args) {
		int k = 0;
		int [][] mtx = new int[5][5];
		
		for(int i = 0;i<5;i++) {
			
			
			for(int j = 4;j>=0;j--) {
				k++;
				mtx[i][j] = k;
			
			}
			System.out.print("\n");
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.printf("%d.",mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
