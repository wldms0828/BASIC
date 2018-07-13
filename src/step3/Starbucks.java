package step3;
/*System.out.println("무엇으로 몇 잔 드릴까요?");
System.out.println("0. 종료 1. 아메리카노3000\n"
		+ "2. 라떼 3500\n"
		+ "3. 카푸치노 4000\n");
System.out.println("결제금액은 총 10000원 입니다.");*/
			
import java.util.Scanner;
public class Starbucks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int count = 0;
		int num = 0;
		
		while(true) {
			System.out.println("무엇으로 드릴까요?");
			System.out.println("0. 종료 1. 아메리카노3000\n"
					+ "2. 라떼 3500\n"
					+ "3. 카푸치노 4000\n");
			int menu = sc.nextInt();
			int[] counts = {3000,3500,4000};
			
			switch(menu) {
		
				case 0 : 
					System.out.println( result );
					return;
				
				case 1 : 
					System.out.println("몇 잔 드릴까요?");
					num = sc.nextInt();
					count = counts[0] * num; 
					result += count;
					break;
				case 2 : 
					System.out.println("몇 잔 드릴까요?");
					num = sc.nextInt();
					count = counts[1] * num;
					result += count;
					break;
				case 3 : 
					System.out.println("몇 잔 드릴까요?");
					num = sc.nextInt();
					count = counts[2] * num;
					result += count;
					break;
				default : System.out.println("ERROR"); break;
				
			}
			
			}
		
	}

}
