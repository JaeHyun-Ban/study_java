package quiz;

public class Quiz26 {
	
	//Quiz13번
	public static void main(String[] args) {
		
		//모든 구구단을 한번에 출력하자
		for(int i = 2; i < 10; i++) {
			System.out.println(i+"단!");
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println("===================================");
		}
		
		
	}
}
