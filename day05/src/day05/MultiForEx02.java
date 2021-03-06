package day05;

public class MultiForEx02 {
	
	//별찍기
	/*
	 *
	 **
	 ***
	 ****
	 *****
	 */
	
	public static void main(String[] args) {
		
		int star = 5;
		
		for(int i = 0; i < star; i++) {
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int i = star; i > 0; i-- ) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		//별을찍는다기 보단 각 회전수를 파악해서 안의 조건이 작동하는 걸 생각하는것이 중요하다
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		for(int i = 0; i < star; i++) {	//5줄 출력
			
			for(int j = 0; j < star-i-1 ; j++) {//공백 4~0칸 출력, i에 맞춰서 함께 공백의 숫자가 줄어듦
				System.out.print(" ");
			}
			
			for(int k = 0; k < i*2+1; k++) {//별 1,3,5,7,9 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}









































