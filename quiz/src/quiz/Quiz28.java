package quiz;

import java.util.Scanner;

public class Quiz28 {
	
	public static void main(String[] args) {
		
		//1. 가로, 세로를 입력 받습니다.
		//2. 가로길이, 세로길이의 사각형을 출력하면 됩니다.
		//3. 단, 윤곽만 나타나도록 처리합니다.
		//조건: 첫 행, 마지막 행에 출력, 첫 열 마지막 열에 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 > ");
		int row = sc.nextInt();
		System.out.print("세로 길이 > ");
		int col = sc.nextInt();
		
		
		for(int i = 0; i < col; i++ ) {
			
			if(i == 0 || i == col-1) {	//첫줄 
				
				for(int j = 0; j < row; j++) {
					System.out.print("*");
				}		
			}else {	//그 외 중간줄
				for(int k = 0; k < row; k+=row-2) {
					System.out.print("*");
					//공백
					for(int a = k+1; a < row-1; a++) {
						System.out.print(" ");
					}
				}
//				if(j == 1 || j == col) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
					
			}
			System.out.println();
		
		}//for end
			
			
		
	}
}




































