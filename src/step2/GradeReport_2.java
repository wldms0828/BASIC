package step2;

import java.util.Scanner;
/**
 화면상에 이름과 국어, 영어, 수학 점수 입력하면 평균을 구한 뒤 평균이 90점 이상이면 "A",
  80점 이상이면 "B", 
  70점 이상이면 "C",
  60점 이상이면 "D",
  50점 이상이면 "E",
  50점 미만이면 "F"로 나타내어라.
  
  출력값은  (이름 [평균] 평균점수 [학점] 학점)
 * */
public class GradeReport_2 {
	public static int[] input(Scanner scan) {
		int[] arr = new int[3];
		int kor = 0, eng = 0, math = 0;
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();
		
		arr[0] = kor ;
		arr[1] = eng ;
		arr[2] = math ;
		
		return arr ;
	}
	public static String[] getGrade(Scanner scan){
		/**
		 * 평균, 총계, 성적 모든것을 빼서 만든 메쏘드
		 * */
		int[] arr = input(scan) ;
		String[] result = new String[3];
		result[0] = String.valueOf(arr[0] + arr[1] + arr[2]);
		result[1] = String.valueOf(Integer.parseInt(result[0])/3);
	    switch(Integer.parseInt(result[1])/10){
            case 9: result[2]="A"; break;
            case 8: result[2]="B"; break;
            case 7: result[2]="C"; break;
            case 6: result[2]="D"; break;
            case 5: result[2]="E"; break;
            default : result[2]="F"; break;
        }
	    return result;
	}
	public static void main(String[] args) {
		String name = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		name = scan.next();
		String[] arr = getGrade(scan);
		System.out.printf("************************************\n");
		System.out.printf("| 이름  |  총점  |  평균  |  등급  |\n");
		System.out.printf("-------------------------------------\n");
		System.out.printf("| %s | %s | %s | %s |\n",
				name,arr[0],arr[1],arr[2]);
		System.out.print("************************************");
	}
	
}