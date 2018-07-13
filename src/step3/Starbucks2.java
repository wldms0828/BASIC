package step3;
import javax.swing.JOptionPane;

public class Starbucks2 {

	public static void main(String[] args) {
		int result = 0;
		int count = 0;
		while(true) {
				String option = JOptionPane.showInputDialog("0. 주문완료\n"
						+ "1. 아메리카노3000\n" 
						+ "2. 라떼 3500\n" 
						+ "3. 카푸치노 4000\n");
	
			int[] counts = {3000,3500,4000};
			String cnt ="";
			switch(option) {
		
				case "0" : 
					JOptionPane.showMessageDialog(null,result);
					return;
				case "1" : 
					cnt = JOptionPane.showInputDialog("몇 잔 드릴까요?");
				
					count = counts[0] * Integer.parseInt(cnt) ; 
					result += count;
					break;
				case "2" : 
					cnt = JOptionPane.showInputDialog("몇 잔 드릴까요?");
			
					count = counts[1] * Integer.parseInt(cnt);
					result += count;
					break;
				case "3" : 
					cnt = JOptionPane.showInputDialog("몇 잔 드릴까요?");
				
					count = counts[2] * Integer.parseInt(cnt);
					result += count;
					break;
				default :
					JOptionPane.showMessageDialog(null, "ERROR");
			; break;
				
			}
			
			}
		
	}

}
