package exception.trycatch;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문을 탈출하려면 '000'을 입력하세요!");
		while(true) {
			try {
				System.out.println("정수1 입력");
				System.out.print("> ");
				int num1 = sc.nextInt();
				if(num1 == 000) {
					break;
				}
				System.out.println();
				
				System.out.println("정수2 입력");
				System.out.print("> ");
				int num2 = sc.nextInt();
				if(num2 == 000) {
					break;
				}
				
				
				System.out.println("정수1 + 정수2 = " + num1 + num2 + "\n");
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요!");
				System.out.println("-----------------------");
				sc.nextLine();
				
			}
			
		}

		System.out.println("프로그램 정상 종료");
		
		
		
		
	}
}











































































