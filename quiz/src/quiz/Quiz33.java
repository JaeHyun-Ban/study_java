package quiz;

import java.util.Scanner;

public class Quiz33 {
	
	//Quiz15번 + 15-1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int clear = 0;
		int fail = 0;
		
		quiz:while(true) {	//while에 이름을 붙이니 편하네
			
			int ran1 = (int)(Math.random()*100)+1;
			int ran2 = (int)(Math.random()*100)+1;
			int oper = (int)(Math.random() * 2); //0~1
			
			int correct = 0;
			
			if(oper == 0) {
				
				correct = ran1 + ran2; //정답
				
				System.out.printf("%d + %d = ?\n",ran1, ran2);
				System.out.println("문제를 그만 푸시려면 0을 입력하세요!");
				System.out.print("> ");
			}else {
				
				correct = ran1 - ran2; //정답
				System.out.printf("%d - %d = ?\n",ran1, ran2);
				System.out.println("문제를 그만 푸시려면 0을 입력하세요!");
				System.out.print("> ");
			}
			
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다!");
				System.out.println("------------------");
				break quiz;	//편하구만
			} else if(num == correct) {
				System.out.println("정답입니다!!!");
				System.out.println("------------------");
				clear++;
			}else {
				System.out.println("틀렸는데요!?!?");
				System.out.println("------------------");
				fail++;
			}
		}//while
		System.out.printf("정답 횟수: %d회\n", clear);
		System.out.printf("틀린 횟수: %d회\n", fail);	
	}
	
}




















