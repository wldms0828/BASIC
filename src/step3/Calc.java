package step3;
import javax.swing.JOptionPane;

/**
 계산하는 java프로그램
 숫자2개와 계산부호를 입력하여 계산값을 뽑아 내고 만약 입력값이 잘못되면 " NOT ANSWER" 로 나타내라.
 * */
public class Calc {
	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog(" Enter Number ");
		int result = Integer.parseInt(num1);
		String result2 = num1+"";
		String add = "";
		while(true) {
		String opcode = JOptionPane.showInputDialog(" Enter opcode ");
		int n2 = 0;
		switch(opcode){
					
			case "=" :
				JOptionPane.showMessageDialog(null, result);
				return;
		
			case "+" : 
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
				result += n2;
				
				break;

			case "-" : 
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
				result -= n2;
				break;

			case "*" : 
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
				result *= n2;
				break;

			case "/" : 
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
				result /= n2;
				break;

			case "%" :
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
				result %= n2;
				
				break;		
			
			default :  JOptionPane.showMessageDialog(null, "NOT ANSWER");
			break;
			}
		
		}
		
	
	}
	

}
