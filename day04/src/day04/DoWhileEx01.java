package day04;

public class DoWhileEx01 {
	
	public static void main(String[] args) {
		
//		int i =1 ;
//		int sum = 0;
//		
//		while(i < 11) {
//			sum += i;
//			
//			i++;
//		}
//		System.out.println("1~10까지의 합: " + sum); 
		
		
		int i = 1;
		int sum = 0;
		do {			//일단 한번 실행하고 조건을 확인한다.
			
			sum += i;
			
			i++;
		}while(i < 11);
		
		
		System.out.println(sum);
		
		
		
		
	}
}









































