package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 메서드 내부에 선언할 수 없습니다.
		 * main밖에, 클래스 안 어디서든 선언할 수 있습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력: ");
		int num = sc.nextInt();
		
		int result = calSum();
		System.out.println("1~10까지합: " + result);
			
		String result2 = randomStr();
		System.out.println("결과: " + result2);
		
		String result3 = randomStr2();
		System.out.println("결과: " + result3);
		
		
		
	} //main
	
	static int calSum() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String randomStr() {
		
		String str = "";//공백
		for(char i = 'A'; i <= 'Z'; i++) {
			str += i;
		}
		
		return str;
	}
	
	static String randomStr2() {
		
		double d = Math.random();
		
//		String str = "";
		if(d > 0.66) {
//			str = "가위";
			return "가위";
		}else if(d > 0.33) {
			return "바위";
		}else {
			return "보";
		}
		
//		return str;
	}
	
}



































