package Example;
import java.util.Scanner;
public class Chapter03 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int result = 0;
		System.out.println("첫번째 계산할 값을 입력하세요 ==>");
		int n1 = s.nextInt();
		System.out.println("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈");
		int opcode = s.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요 ==>");
		int n2 = s.nextInt();
		if(opcode==1) {
			result = n1 + n2;
			System.out.println(n1 +"+"+ n2 +"="+ result);
		}else if(opcode==2) {
			result = n1 - n2;
			System.out.println(n1 +"-"+ n2 +"="+ result);
		}else if(opcode==3) {
			result = n1 * n2;
			System.out.println(n1 +"*"+ n2 +"="+ result);
		}else {
			result = n1 / n2;
			System.out.println(n1 +"/"+ n2 +"="+ result);
		}

	}

}
