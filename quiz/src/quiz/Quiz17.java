package quiz;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		
		
		//1. 1~입력받은 정수가 3의 배수이거나, 4의 배수일 경우에 가로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			
			if(i%3 == 0 || i%4 == 0) {
				System.out.print(i + " ");
			}
			
			i++;
		}
		sc.close();
		
		
		//2. 1~입력받은 정수까지 6의 배수의 합
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
//		
//		int i = 0;
//		int sum = 0;				//합을 저장할 변수
//		while(i <= num) {
//			if(i%6 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("6의 배수의 합: " + sum);
//		sc.close();
			
		
		//3. 1~100까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수의 개수
//		int i = 1;
//		int count = 0;
//		while(i < 101) {
//			
//			if(i%4 == 0 && i%8 != 0) {
//				count++;
//			}
//			i++;
//		}
//		System.out.println("4의 배수이며 8의 배수가 아닌 수의 갯수: " + count);
		
		
		
		//4. 1000까지 약수의 개수
//		int i = 1;
//		int count = 0;
//		while(i < 1001) {
//			if(1000%i == 0) {
//				count++;
//			}
//			i++;
//		}
//		System.out.println("1000까지 약수의 개수: " + count);
//		
		
		
		
		
		
		
		
	}
}











































