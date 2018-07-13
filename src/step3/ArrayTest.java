package step3;
import javax.swing.JOptionPane;
public class ArrayTest {
	public static int getTotal(String[] scores) {
		return Integer.parseInt(scores[1]) + Integer.parseInt(scores[2]) + Integer.parseInt(scores[3]);
		}
	public static void main(String[] args) {
		String[] result = new String[3];
		
		int count = 0;
		while(true) {
			String menu = JOptionPane.showInputDialog("0. 종료, 1. 성적입력, 2. 전체보기, 3. 순위출력");
			String[] arr = new String[4];
			switch(menu) {
				case "0" : return;
				case "1" :
					String score = JOptionPane.showInputDialog("이름 / 국어 / 영어 / 수학");
					arr = score.split("/");
					int total = getTotal(arr);
					int avg = getTotal(arr)/3;
					
					String grade = "";
					switch(String.valueOf((getTotal(arr)/3)/10)) {
					case "9" : 
						grade = "A";
						JOptionPane.showMessageDialog(null,grade);
						break;
					case "8" : 
						grade = "B";
						JOptionPane.showMessageDialog(null,grade);
						break;
					case "7" :
						grade = "C";
						JOptionPane.showMessageDialog(null,grade);
						break;
					case "6" :
						grade = "D";
						JOptionPane.showMessageDialog(null,grade);
						break;
					case "5" : 
						grade = "E";
						JOptionPane.showMessageDialog(null,grade);
						break;
					default : 
						grade = "F";
						JOptionPane.showMessageDialog(null,grade);
						break;
					}
					String student = arr[0]+" | "+arr[1]+" | "+ arr[2]+" | "+arr[3]+" | "+ total +" | "+ avg +" | "+ grade;
					result[count] = student;
					count++;
					break;
				case "2" : 
				/*	( 이름 / 국어 / 영어 / 수학 / 총점 / 평균 / 등급 )
					String name = 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 등급  */
					String name = " 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 등급\n " ;
						for(int i = 0;i<result.length;i++) {
							name += result[i]+"\n";
						}
					JOptionPane.showMessageDialog(null, name);
					break;
				case "3" : 
					
					String[] temp = result[0].split("\\|");
					int a = Integer.parseInt(temp[4]);
					temp = result[1].split("\\|");
					int b = Integer.parseInt(temp[4]);
					temp = result[2].split("\\|");
					int c = Integer.parseInt(temp[4]);
						
					
					break;
				default : break;
			}
			
		}

	}

}
