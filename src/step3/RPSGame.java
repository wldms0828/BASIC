package step3;

import javax.swing.JOptionPane;

/**
 * 가위바위보 게임을 하면서 입력자는 2명. 입력했을때 이기는 사람의 결과값을 보여주는 자바프로그램을 만들어라 ex) R vs R = 비김
 */
public class RPSGame {
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		int count3 = count2 - count;
		while (true) {
			
			int com = (int) (Math.random() * 10);
			if (com < 4 && com != 0) {
				String n2 = JOptionPane.showInputDialog("Enter 1.R, 2.S, 3.P");
				int flag = com - Integer.parseInt(n2);
				count2++;
				JOptionPane.showMessageDialog(null, count2 + "전" + count + "승" + count3 + "패");
				switch (flag) {
				case 0:
					JOptionPane.showMessageDialog(null, "무승부");

					break;
				case -1:
				case 2:

					JOptionPane.showMessageDialog(null, "com 이김");

					break;

				case -2:
				case 1:

					JOptionPane.showMessageDialog(null, "사용자 이김");
					count++;
					
					break;

				}
			}
		}

	}

}
