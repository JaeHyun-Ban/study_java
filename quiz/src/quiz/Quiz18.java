package quiz;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;				//while을 멈추게할 용도
		int sum = 0;
		
		System.out.println("0을 입력하면 종료합니다!");
		while(i != 0) {
			
			System.out.print("정수 입력> ");
			i = sc.nextInt();
			sum += i;
//			int num = sc.nextInt();
//			if(num == 0) {
//				i++;
//			}
//			sum += num;
			
		}
		System.out.println("-------------------------------");
		System.out.println("입력 받은 정수의 합: " + sum);
		sc.close();
		
		
		
		
		
		
		
		
	}
	
	
}






































