package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		
		//소수 판별 2번째 방법'
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) {	//약수일 때
				count++;
			}
			
		}
		System.out.println(count == 2 ? num + "은 소수!" : num + "은 소수가 아니다!");
		
		
		
		
		
		
	}
}






















