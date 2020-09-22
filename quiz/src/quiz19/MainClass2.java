package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws Exception {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다. 
		 * 입력한 값이 1에서 100까지의 값이 아니라면
		 * 예외처리 구문으로 넘기고 다시 입력받도록 처리합니다. 
		 * -----------------요 위까지 try로 구문 작성 
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에 다시 입력받도록 처리합니다. 
		 * 단, 카운트는 처리 됩니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		int correct = (int)(Math.random() * 100) + 1; 
		int count = 0;
		
		while(true) {
			
			try {
				
				System.out.print("1~100사이의 값을 입력하세요> ");
				int answer = sc.nextInt();
				
				if(answer < 1 || answer > 100) {
					
				}
				count++;
				
				if(correct > answer) {
					System.out.println("더 큰수를 입력하세요");
				}else if(correct < answer) {
					System.out.println("더 작은 수를 입력하세요");
				}else {
					System.out.println("정답입니다.");
					System.out.println("시도횟수: " + count);
					break;
				}
				
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
				sc.nextLine();//엔터값 제거
			}catch (Exception e) {
				System.out.println("1~100사이의 숫자를 입력하세요!");
				count++;
			}
			sc.close();
			
		}

	}
}


























