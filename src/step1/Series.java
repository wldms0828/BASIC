package step1;
import java.util.Scanner;
/**
 시작값과 끝값을 입력하여 시작값 부터 끝값 까지의 합을 구하여라.
 but, 끝값이 시작값보다 작으면 작은 수가 앞으로 오게 하여 합을 구하는 프로그램을 구하여라.
 ex) 1+2+3+......10=?
 * */
public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
	
		switch(scan.nextInt()){
		case 0 : return;
		case 1 : 
			System.out.println("시작값을 입력하세요");
			int start = scan.nextInt();
			System.out.println("끝값을 입력하세요");
			int end = scan.nextInt();
			String result = "";
			int sum = 0;
			for(int i = start; i<=end;i++) {
				if(i==end) {
					result += i + "=";
				}else {
					result  += i + "+";
			}		
				sum += i ;
			}
			System.out.println(result + sum);
			break;
		
		default : System.out.println("Error"); break;
		}
	}
	}

}
