package quiz;

import java.util.Scanner;

public class Quiz23 {
	
	public static void main(String[] args) {
		
		/*
		 - 두 정수를 입력받는다.
		 - 두 수의 크기는 정해지지 않았다.
		 - 두 수 사이의 합을 구하는 코드를 최대한 간략하게 작성해 보세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 > ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
//		if(num1 == num2) {
//			sum = 0;
//		}else if(num1 > num2) {
//			for(int i = num2; i <= num1; i++) {
//				sum += i;
//			}
//		}else {
//			for(int i = num1; i <= num2; i++) {
//				sum += i;
//			}
//		}
		
		//for문의 3항 연산식 -> 으아아?
		
		
		for(int i = num1 == num2 ? 0 : (num1 > num2 ? num2 : num1) ;
		i <= (num1 == num2 ? 0 : (num1 > num2 ? num1 : num2)) ;
		i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d 사이의합: %d\n", num1, num2, sum);
		sc.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}























