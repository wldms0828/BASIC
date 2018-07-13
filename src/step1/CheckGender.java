package step1;
import java.util.Scanner;
/**
      * 프로그램을 하나 개발해야 합니다.
      * 교수가 주민번호를 입력하면 해당 학생이 남자인지,
        여자인지, 외국인인지
      * 자동 으로 출력해 주는 프로그램을 만들어 달랍니다.
      * 오더는 다음과 같이 화면에 출력하라고 합니다.
      * 홍길동 : 800101 -1234567 : 남
      * 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
      * 현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면
        여자, 5,6 이면 외국인
      * 교수가 실수로 0,7,8,9 로 시작 주민번호를 입력하면
      * "다시 입력하세요" 라고 알려주시길 바랍니다.

      성별 String gender = "";
      주민등록번호 800101-1234567 에서 1 을 추출하는 문법
      String ssn = "800101-1234567";
      char ch = ssn.charAt(7); 하면 1 이 추출되어 ch 에 담긴다.
      그러면 내부값은 '1' 이렇게 된다
      if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){...}
* */

public class CheckGender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("idn");
		String idn = scanner.next();
		char ch = idn.charAt(7);
		System.out.println("name");
		String name = scanner.next();
		String gender ="";
		
			if(ch=='1'||ch=='3'){
			gender = "남";
			}else if(ch=='2'||ch=='4'){
			gender = "여";
			}else if(ch=='5'||ch=='6'){
			gender = "외국인";
			}else{
			gender = "다시 입력하세요";
			}
			System.out.println(name + ":" + idn + ":" + gender );
		}
	}

}
