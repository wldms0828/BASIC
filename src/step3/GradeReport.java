package step3;
import java.util.Scanner;
/**
 화면상에 이름과 국어, 영어, 수학 점수 입력하면 평균을 구한 뒤 평균이 90점 이상이면 "A",
  80점 이상이면 "B", 
  70점 이상이면 "C",
  60점 이상이면 "D",
  50점 이상이면 "E",
  50점 미만이면 "F"로 나타내어라.
  
  출력값은  (이름 [평균] 평균점수 [학점] 학점)
 * */
public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
	  	System.out.println("이름");
	  	String name = scanner.next();
		System.out.println("국어점수");
		int num1 = scanner.nextInt();
		System.out.println("영어점수");
		int num2 = scanner.nextInt();
		System.out.println("수학점수");
		int num3 = scanner.nextInt();
		String credit = "";
		int avr = (num1+num2+num3)/3;
		if(avr >= 90){
			credit = "A";
		}else if(avr >= 80){
			credit = "B";
		}else if(avr >= 70){
			credit = "C";
		}else if(avr >= 60){
			credit = "D";
		}else if(avr >= 50){
			credit = "E";
		}else {
			credit = "F";
		}
		

		
		System.out.println ( name + "[평균]" + avr + "[학점]" + credit ); 
		}

	}

}
