package step4;

public class Zigzag {

	public static void main(String[] args) {
		int k = 0;
		
		int mtx[][] = new int [5][5];
		for(int i = 0;i<5;i++) {
				if(i==3 || i==1) {
					for(int j = 4 ; j>=0;j--) {
						k++;
						mtx [i][j] = k;}}
				else {
					for(int j=0;j<5;j++) {
					
					k++;
					mtx [i][j] = k;}
				}
			
			
			
			System.out.print("\n");
		}
	
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}

}
