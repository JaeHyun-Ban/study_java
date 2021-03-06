package quiz10;

import java.util.Arrays;

public class MyCart extends Cart{
	
	MyCart(int money){
		super();
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
		this.money = money;
	}
	
	
	
	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. 
	//	tv=300원, com=400원, radio=500원 으로 초기화

	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도(아니라면) "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	@Override
	void buy(String product) {
		
		if(this.money < 300) {
			System.out.println("금액이 부족합니다!");
			return; //리턴을 이용해 여기서 끝내준다.
		}else if(product.equals("tv")) {
			money -= tv;
			add("tv");
		}else if(product.equals("com")) {
			money -= com;
			add("com");
		}else if(product.equals("radio")) {
			money -= radio;
			add("radio");
		}else {
			System.out.println("상품이 존재하지 않습니다!");
		}
	}
	
	
	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	@Override
	void add(String product) {
		
		//카트 꽉찼을 때
		if(i >= cart.length) {
			String[] tmp = new String[cart.length*2];
			//null제거
			for(int i = 0; i < tmp.length; i++) {
				if(tmp[i] == null) {
					tmp[i] = "";
				}
			}
			
			for(int i = 0; i < cart.length; i++) {
				tmp[i] = cart[i];
			}
			cart = tmp; //2배된 배열 넣엊기
		}
		
		cart[i] = product;
		i++;
		System.out.println(Arrays.toString(cart));
		info();
	}
	
	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */
	
	@Override
	void info() {
		
		int sum = 0;
		for(int i = 0; i < cart.length; i++) {
			if(cart[i].equals("tv")) {
				sum += 300;
			}else if(cart[i].equals("com")) {
				sum += 400;
			}else if(cart[i].equals("radio")) {
				sum += 500;
			}
		}
		System.out.println("장바구니의 총 금액: " + sum);
		System.out.println("남은 금액: " + money);
		System.out.println("----------------------");
	}
	
	
}





































