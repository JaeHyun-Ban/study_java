package quiz;

import java.util.Scanner;

public class Quiz29 {
	
	//숙제(?) - 08/26
	//Quiz14
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int count = 0; //소수 체크
		//소수들의 합
		
		
		
		start:for(int i = 2; i <= num; i++) {
			
			count = 0;	//초기화
			
			for(int j = 2; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
				//중간에 미리 쳐내서 반복문으로 돌아가게하면 더 빠르게(효율적)으로 작동한다
				if(count > 1) {	//실행 해보면 이게 더 빠름
					continue start;
				}
				
			}
			//값이 커질수록 조건식이 계산하는데 느려진다 ex) 1000000을 입력
			if(count == 1) {
				sum += i;
			}
		}
		System.out.printf("%d까지 소수의 합은: %d\n", num, sum);
		//	2 2
		//	3 2
		//	  3
		
		
		
		
		
		
	}//main
}






