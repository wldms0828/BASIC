package step2;

/**
 기사시험문제: [수열1] 1+2+3+...+100 까지의 합계
 변형된 요구사랑 : 
 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오.
 출력 : 1+2+3+...+10=55
 * */
import java.util.Scanner;

public class SequenceSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(" 0. 종료 1. 실행 ");
			String result = "";
			int sum = 0;
			
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("시작값을 입력하시오.");
				int start = scan.nextInt();
				System.out.println("끝값을 입력하시오.");
				int end = scan.nextInt();
				for (int i = start; i <= end; i++) {
				/*	if (i == end) {
						result += i + "=";
					} else {
						result += i + "+";
					}*/
					result += (i == end)?i + "=":i + "+";
					sum += i;
				}
				System.out.println(result + sum);
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}

}
