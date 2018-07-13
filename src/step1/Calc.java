package step1;
import java.util.Scanner;
/**
 계산하는 java프로그램
 숫자2개와 계산부호를 입력하여 계산값을 뽑아 내고 만약 입력값이 잘못되면 " NOT ANSWER" 로 나타내라.
 * */
public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println(" Enter Number 1 ");
		int num1 = scan.nextInt();
		System.out.println(" Enter opcode ");
		String opcode = scan.next();
		System.out.println(" Enter Number 2 ");
		int num2 = scan.nextInt();
		int num3 = 0;
		String result = "";
		switch(opcode){
			case "+" : num3 = num1 + num2;break;

			case "-" : num3 = num1 - num2;break;

			case "*" : num3 = num1 * num2;break;

			case "/" : num3 = num1 / num2;break;

			case "%" : num3 = num1 % num2;break;

			default : result = "NOT ANSWER";break;}

		if(!result.equals("NOT ANSWER")){
			result = num1 + opcode + num2 + "=" + num3;

		}
		System.out.println(result);
		}
	}
	

}
