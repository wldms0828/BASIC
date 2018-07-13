package step1;
import java.util.Scanner;
/**
 MonthEndday.java
    월을 입력해서 해당 월의 마지막 날을
       알려주는 로직.
       예를 들면, 3월이면 말일이 3월31일입니다.
       9월이면 말일이 9월30일입니다.라고 알려줌.
       단 2월은 2월28일을 말일로 해서 2월28일입니다.
    라고 함.
 * */
public class MonthEndday {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		 System.out.println("월을입력하세요.");
		 int mon = scanner.nextInt();
		 String last = "";
		 if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12){
			last = "31일";
		 }else if(mon==4||mon==6||mon==9||mon==11){
			last = "30일";
		 }else {
			last = "28일";
		 }
		 System.out.println( mon + "월" + last );
		}

	}

}
