package step2;

/**
1부터 10까지 합을 구하시오.
출력은 1+2+3+...+10=55
 * */
import java.util.Scanner;

public class EvenOddSum2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(" 0.종료 1.홀수의 합 2.짝수의 합 ");
			String result = "";
			int sum = 0;
			switch(scan.nextInt()){
			
				
				case 0 : return;
				case 1 : 
					System.out.println("시작값을 입력하시오.");
					int start = scan.nextInt();
					System.out.println("끝값을 입력하시오.");
					int end = scan.nextInt();
					
					int num1 = 0, num2 = 0, count= 0;
					if(start>end) {
						num1 = end;
						num2 = start;
					}else {
						num1 = start;
						num2 = end;
					}
				
						for(int i = start; i<end+1; i++) {
							if(i%2==1) {
								if(i==end) {
									result += i + "=";
								}else{
									}result += i + "+";
								}
								sum += i;
													
						}
						System.out.println(result + sum);
				break;
				case 2 : 
					System.out.println("시작값을 입력하시오.");
					int n1 = scan.nextInt();
					System.out.println("끝값을 입력하시오.");
					int n2 = scan.nextInt();
					int s = 0, e = 0;
					if(n1>n2) {
						n1 = e;
						n2 = s;
					}else {
						n1 = s;
						n2 = e;}
						for(int i = n1 ; i < n2+1 ; i++) {
							if(i%2==0) {								
								if(i==n2) {
								result += i + "=";
							}else {
								result += i + "+";
							}
							sum += i; 
							System.out.println(result + sum);
						}
					break;
						}
				default : System.out.println("Error");break;
				
			}
		
		}
	}

}
