package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		//입력을 10번 받는다. 입력받은 값의 합을 구함
		
		Scanner sc = new Scanner(System.in);	//선언은 밖에다가 한다.
		
		int i = 1;
		int sum = 0;
		while(i < 11) {
						
			System.out.print("정수 입력: ");
			int num = sc.nextInt();
			sum += num;
			
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}






































