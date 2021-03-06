package day07;

public class MethodEx03 {

	
	public static void main(String[] args) {
		
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이기 떄문에, 다른 메서드의 매개값으로 사용이 가능합니다.
		 * 		ex) println(메서드 호출)
		 * 3. 반환값이 없는 경우 void라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 강제 종료됩니다.
		 * 4. 그래서 return문 아래 코드를 작성할 수 없습니다.
		 */
		
		
//		int result = add(3, 5);
		int result = add(add(1,2), add(2,3));
		System.out.println("결과: " + result);
		System.out.println( add(1,2));//반환유형이 존재하면 출력에 바로 사용할 수 있다.
		
		
		//void형 메서드는 retrun이 없기 때문에 단순히 호출만 가능함
//		System.out.println( sub(10, 5));
//		int result2 = sub(10,5);
		sub(10, -5);
		multi();
		
		noReturn("멍청이");
	}
	
	
	static int add(int a, int b) {
		return a + b;
		
	}
	
	static void sub(int a, int b) {//반환 유형이 없는 메서드
		System.out.println(a + "-" + b + "=" + (a-b));
	} //단순호출만 가능
	
	//반환도, 매개변수도 없다
	static void multi() {
		System.out.println("단순 출력만");
		 System.out.println("오직 단순 출력만");
	};
	
	static void noReturn(String s) {
		
		if(!s.equals("똑똑이")) {
			System.out.println(s+ "가 아니고 똑똑이를 전달하세요");
			return; //종료 효과
		}
		System.out.println("감사!");
		
	}
	
	
	
}



























