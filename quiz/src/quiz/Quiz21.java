package quiz;

public class Quiz21 {

	public static void main(String[] args) {
		
		//for문 작성
		//math.random을 이용해서 2~9까지 랜덤 수를 만들고 해당 단수에 대한 구구단을 출력.
		
		int ranDan = (int)(Math.random()*8 + 2);
		
		System.out.println("랜덤 구구단 출력!");
		System.out.println(ranDan + "단!");
		System.out.println("=============================");
		for(int i = 1; i < 10; i++) {
			
			System.out.printf("%d * %d = %d\n", ranDan, i , ranDan*i);
//			System.out.println(ranDan + " x " + i + " = " + (ranDan*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}










































