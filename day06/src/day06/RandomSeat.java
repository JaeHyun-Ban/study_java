package day06;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 사람수를 입력받을 수 있습니다.
		 * 2. 입력받은 사람수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다.
		 * 	예를 들어서 25를 받으면, 1~25까지 숫자가 중복되지 않게
		 * 	크기가 25인 배열에 랜덤하게 배정되면 됩니다.
		 * 
		 * 3. 해당 배열의크기만큼 ○으로 출력해주세요.(ㅁ한자9)
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 된 자석이라면 자리번호를 공개하면 되고, 제대로 선택되지 않은 좌석이면
		 * 		"경고문을 띄워주세요"
		 * 
		 * 선택된 자리는 ●로 다시 표기해주세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배정할 좌석의 크기를 지정해주세요> ");
		int num = sc.nextInt();	
		
		int[] seat = new int[num]; //좌석번호
		String[] check = new String[num]; //체크용
		for(int i = 0; i < num; i++) {
			seat[i] = i+1;
			check[i] = "○";
		}
		
		int[] ranArr = new int[num];
		boolean flag = false; //
		
		//중복되지 않은 난수 배열 생성
		for(int i = 0; i < num; i++) {
			
			//중복이 아닐때까지 반복
			while(true) {
				
				int ranNum = (int)(Math.random()*num)+1; //난수 생성			
				ranArr[i] = ranNum; //배열에 넣기
				//중복확인
				for(int j = 0; j < i; j++) { // i번째 전까지의 수와 모두 비교
					//중복이 있다면
					if(ranArr[i] == ranArr[j]) {
						flag = true;
						break;//다시 while로
					}//중복이 아니라면
					else if(ranArr[i] != ranArr[j]) { //중복이 아니라면
						flag = false;
					}
				}
				//탈출조건용(여기까지 왓다면 중복이 아님)
				if(!flag) {
					break;//while 탈출
				}		
			}
		}		
		
		//확인용
//		System.out.println(Arrays.toString(seat));
//		System.out.println(Arrays.toString(check));
		System.out.println(Arrays.toString(ranArr));
		
		//자리 고르기
		seat:while(true) {
			
			System.out.println("--------------------좌석 선택 프로그램--------------------");
			//좌석 번호와 동그라미 출력
			for(int a : seat) {
				System.out.printf("%-3d",a);
			}System.out.println();
			for(String a : check) {
				System.out.printf("%-3s",a);
			}	
			
			System.out.println();
			System.out.print("좌석 선택> ");
			int seatNum = sc.nextInt(); //좌석 번호
			if(seatNum > num || seatNum <= 0) { //이상한 번호 체크
				System.out.println("잘못된 번호 입니다. 다시 입력해 주세요!");
				System.out.println();
				continue;
			}
			
			//3..2..1..타이머
			for(int i = 3; i > 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("sleep에서 에러 발생!");
					e.printStackTrace();
				}
			}
			
			System.out.println("좌석번호: " + ranArr[seatNum-1]);
			check[seatNum-1] = "●";
			
			//탈출문
			int count = 0; //탈출용
			for(int i = 0; i < num; i++) {
				if(check[i] == "●") {
					count++;
				}
				if(count == num) {
					System.out.println("-----------------------------");
					System.out.println("자리가 모두 선택되었습니다!");
					break seat;
				}
			}
			
		}//while
		
		
		
		
	}//main
}




































