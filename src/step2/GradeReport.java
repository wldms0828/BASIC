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
public class GradeReport {
	public static int[] input (Scanner sc){
		int[] arr = new int[3];
		System.out.println("국어점수");
		int kor = sc.nextInt();
		System.out.println("영어점수");
		int eng = sc.nextInt();
		System.out.println("수학점수");
		int math = sc.nextInt();
		arr[0] = kor;
		arr[1] = eng;
		arr[2] = math;
		return arr;
	}
	public static int[] put(int[] arr) {
		/**
		 * 평균과 총계를 배열로 빼서 만든 메쏘드
		 * */
		int n[]	= new int[2];	
		int avr = (arr[0] + arr[1] + arr[2])/3, total = arr[0] + arr[1] + arr[2] ;
		
		n[0]=avr;
		n[1]=total;
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0 ;
		
		while(true) {
			int[] arr2 = input (sc);
			int[] arr3 =put(arr2);
	  	System.out.println("이름");
	  	String name = sc.next();
		/*System.out.println("국어점수");
		int kor = scanner.nextInt();
		System.out.println("영어점수");
		int eng = scanner.nextInt();
		System.out.println("수학점수");
		int math = scanner.nextInt();*/
		String grade = "";
		
		/*int avg = ( kor + eng + math )/3, total= kor + eng + math;*/
		int avg = arr3[0];
		int total = arr3[1];
		if(avg >= 90){
			grade = "A";
		}else if(avg >= 80){
			grade = "B";
		}else if(avg >= 70){
			grade = "C";
		}else if(avg >= 60){
			grade = "D";
		}else if(avg >= 50){
			grade = "E";
		}else {
			grade = "F";
		}
		System.out.printf("*******************************************\n");
		System.out.printf("| 이름 | 총점 | 평균 | 등급 \n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("| %s | %d | %d | %s |\n", name,total,avg,grade );
		System.out.println("*******************************************");
		}

	}

}
