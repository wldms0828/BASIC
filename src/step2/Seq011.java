package step2;
/**
[수열011] 1-2+3-4+5-6....-100 = -50 합계(스캐너 없음)
 * */

public class Seq011 {
	public static void main(String[] args) {
		int sum = 0;
		String result = "";
		int odd = 0, even = 0;
		for(int i = 1; i < 101;i++ ) {
			if(i==100) {
				result += i + "=";
			} else {
				
					if(i%2==1) {
						result += i + "-";
						odd += i;
					}else {
						result += i + "+";
						even += i;
					}
			}
			sum = even - odd;
		
					
		}
		System.out.println(result + sum);
	}
}
