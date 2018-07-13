package step2;
import java.util.Scanner;
/**
 가위바위보 게임을 하면서 입력자는 2명.
 입력했을때 이기는 사람의 결과값을 보여주는 자바프로그램을 만들어라
 ex) R vs R = 비김
 * */
public class RPSGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("Enter R.S.P");
		String alp1 = scan.next();
		System.out.println("Enter R.S.P");
		String alp2 = scan.next();

		if(alp1.equals("R") && alp2.equals("R")){
			
			System.out.println("비김");

		}else if(alp1.equals("R") && alp2.equals("S")){
		
			System.out.println("alp1 이김");
		
		}else if(alp1.equals("R") && alp2.equals("P")){
		
			System.out.println("alp2 이김");

		}else if(alp1.equals("S") && alp2.equals("R")){
			
			System.out.println("alp2승리");

		}else if(alp1.equals("S") && alp2.equals("S")){
		
			System.out.println("비김");

		}else if(alp1.equals("S") && alp2.equals("P")){
			
			System.out.println("alp1 이김");

		}else if(alp1.equals("P") && alp2.equals("S")){
			
			System.out.println("alp2 이김");

		}else if(alp1.equals("P") && alp2.equals("P")){
			
			System.out.println("비김");

		}else{
			System.out.print("alp1 이김");

		}
		}

	}

}
