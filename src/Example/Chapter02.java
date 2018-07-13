package Example;
import java.util.Scanner;
public class Chapter02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 0;
		System.out.println("Enter Num1");
		int num1 = s.nextInt();
		System.out.println("Enter Num2");
		int num2 = s.nextInt();
		System.out.println("Enter Num3");
		int num3 = s.nextInt();
		System.out.println("Enter Num4");
		int num4 = s.nextInt();
		
		result = num1 + num2 + num3 + num4;
		
		System.out.println(num1 +"+"+ num2 +"+"+ num3 +"+"+ num4 +"="+ result);
		
	}
}
