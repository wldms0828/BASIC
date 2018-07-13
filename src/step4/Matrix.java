package step4;

import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
	DIAGNOL,
	SNAIL,
	MAGIC_SQUARE,
	MATRIX_CONVERSION;
	
}
public class Matrix {
	public static String triangle() {
		String result="";
		int k = 0;
		int [][] mtx = new int[7][4];
		for(int i = 0;i<4
				;i++) {
			if(i==0) {
				for(int j = 3;j<4;j++) {
					k++;
					mtx[j][i] = k;}
				
			} else if(i==1) {
				for(int j = 2;j<5;j++) {
					k++;
					mtx[j][i] = k;
				}
			}else if(i==2) {
				for(int j = 1;j<6;j++) {
					
					k++;
					mtx[j][i] = k;
				}
				
			}else {
				
				for(int j = 0;j<7;j++) {
					k++;
					mtx[j][i] = k;
				}
			}
			
		}
		for(int i = 0;i<7;i++) {
			for(int j = 0;j<4;j++) {
			result +=	mtx[i][j];
			}
			result += "\n";
		}
		return result;
	}
	public static String sandGlass() {
		String result = "";
		int k = 0;
		int [][] mtx = new int[5][5];
		for(int i = 0;i<5;i++) {
			if(i==0 || i==4) {
				for(int j = 0;j<5;j++) {
					k++;
					mtx[i][j] = k;
				}
			}else if(i==2) {
				for(int j = 2;j<3;j++) {
					k++;
					mtx[i][j] = k;
				}
			}else {
				for(int j = 1;j<4;j++) {
					k++;
					mtx[i][j] = k;
					
				}
			}
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
			result +=	mtx[i][j];
						}
			result +="\n";
		}
		return result;
	}
	public static String diamond() {
		String result = "";
		int k = 0;
		int [][] mtx = new int[5][5];
		for(int i = 0;i<5;i++) {
			if(i==0 || i==4) {
				for(int j = 2;j<3;j++) {
					k++;
					mtx[i][j] = k;
			}}else if(i==2) {
				for(int j = 0;j<5;j++) {
					k++;
					mtx[i][j] = k;
				}
			}else {
				for(int j = 1;j<=3;j++) {
					k++;
					mtx[i][j] = k;
				}
			}
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				result += mtx[i][j];
			}
			result +="\n";
		}
			return result;
	}
	public static String zigZag() {
		String result="";	
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
		}
	
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
			result += mtx[i][j];
			}
			result += "\n";	
		}
		return result;
	}
	public static String rightTriangle() {
		String result = "";
		int k =0;
		int[][] mtx = new int[5][5];
		for(int i = 0; i<5;i++) { 
			for(int j = 4 ; j>=(4-i);j-- ) {
			k++;
			mtx[i][j] = k;
					
			}
		}
			for(int i = 0;i<5;i++) {
				for(int j = 0;j<5;j++) {
					result += mtx[i][j];	
				}
				result += "\n";
			}
			return result;
	}
	public static String leftTriangle() {
		String result = "";
		int k = 0;
		int [][] mtx= new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				
				k++;
				mtx[i][j]=k;
				
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				result += mtx[i][j];
				
			}
			result += "\n";
		}
		return result;
	}
	public static void main(String[] args) {
		String result ="";
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SAND_GLASS,
				Butt.TRIANGLE,
				Butt.DIAGNOL,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE,
				Butt.MATRIX_CONVERSION};
		
			while(true) {
				Butt select = (Butt)JOptionPane.showInputDialog(null,//frame
						"MATRIX PAGE",//frame title
						"SELECT MATRIX MENU", //order
						JOptionPane.QUESTION_MESSAGE,//type
						null, // icon
						buttons, //Array of choices
						buttons[1] //default
								);
				switch (select) {
				case EXIT :	return;
				case LEFT_TRIANGLE : result =leftTriangle();break;
				case RIGHT_TRIANGLE : result =rightTriangle();break;
				case ZIGZAG : result=zigZag();break;
				case DIAMOND : result=diamond();break;
				case SAND_GLASS : result=sandGlass();break;
				case TRIANGLE : result=triangle();break;
				default : 
					break;
			}
				JOptionPane.showMessageDialog(null, result);
			}
		

	}

}
