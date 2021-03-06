package day06;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat00 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기> ");
		int size = sc.nextInt();
		
		int[] arr = new int[size]; // 좌석을 저장할 배열
		int index = 0;
		
		
		//중복되지 않는 랜덤값 배열 생성 
		start:while(true) {
			
			if(index == size) break;
			
			int seat = (int)(Math.random() * size) + 1;
			
			//중복검사(랜덤값과 배열의 index번째까지 동일한 값이 있는지 확인
			for(int i = 0; i < index; i++ ) {
				if(arr[i] == seat)  //중복
					continue start; //이렇게 넘길수도 있네	
			}
			
			arr[index] = seat;
			index++;
			
			
		}
//		System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.println("-------------------------좌석 선택 프로그램-----------------------");
			//숫자 출력
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%-3d", i+1);
			}
			System.out.println();
			//동그라미 출력
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {
					System.out.printf("%-3s", "●");
				}else {
					System.out.printf("%-3s", "○");
				}
			}
			System.out.println();
			
			System.out.print("좌석선택> ");
			int seat = sc.nextInt();
			
			for(int i = 3; i > 0; i--) {
				System.out.println(i);
				//쓰레드 = 프로그램의 실행 흐름 (main 쓰레드 하나만 작동중)
				Thread.sleep(1000);//300 = 0.3초 멈춤
			}
			System.out.println();
			
			
			
			if(arr[seat -1] == 0) {
				System.out.println("제대로 선택하실래요?");
			}else {
				System.out.println("자리 번호: " + arr[seat-1]);
				arr[seat-1] = 0;
			}
			
		}
		
		
	
		
		
		
		
	}
}

































