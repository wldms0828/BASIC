package step2;

import java.util.Scanner;

/**
* 기사시험문제: [수열010]
* 1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을
* 구현하시오 출력 : 1+2+3+...+10=55
*/
import java.util.Scanner;
public class Seq010 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("0. 종료 1. 실행");
			int sum = 0;
			String result = "";	
			switch(s.nextInt()) {
			case 0 : return;
			case 1 :
				System.out.println("시작값을 입력하시오.");
				int num1 = s.nextInt();
				System.out.println("끝값을 입력하시오.");
				int num2 = s.nextInt();
				for(int i = num1; i <= num2; i++) {
					if (i==num2) {
						result += i + "=";
					} else {
						result += i + "+";
						sum += i;
					}
					
					System.out.println(result + sum);
					break;
				
				}
			default : System.out.println("ERROR");break;
				
			}
		}
	}
}

       