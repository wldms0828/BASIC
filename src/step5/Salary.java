package step5;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, INPUT, LIST
};

public class Salary {

	public static void main(String[] args) {
		String[][] mtx = new String[5][5];
		Butt[] buttons = { Butt.EXIT, Butt.INPUT, Butt.LIST };
		String[] arr = { "부서 ", " 성명 ", " 본봉 ", " 수당 ", " 합계 " };
		String result = "";
		int i = 0;
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"부서별 합계", // frame title
					"기능을 선택하시오", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			);
			switch (select) {
			case EXIT:
				return;
			case INPUT:

				for (int j = 0; j < 4; j++) {
					mtx[i][j] = JOptionPane.showInputDialog(arr[j]);
					result += mtx[i][j];
					if (j == 3) {
						mtx[i][4] = String.valueOf(Integer.parseInt(mtx[0][2]) + Integer.parseInt(mtx[0][3]));
					}
					result += " ";
				}
				result += mtx[i][4] + "\n";
				i++;
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				break;
			}
		}
	}
}