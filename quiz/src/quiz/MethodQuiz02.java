package quiz;

import java.util.Arrays;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		
		method01();
		System.out.println("=================================");
		
		String str = method02("안녕");
		System.out.println("리턴받은 매개변수: " + str);
		System.out.println("=================================");
		
		double add = method03(1, 3, 0.555);
		System.out.println("세 변수의 합: " + add);
		System.out.println("=================================");
		
		System.out.println(method04(5));
		System.out.println("=================================");
		
		method05(4);
		System.out.println("=================================");
		
		System.out.println("큰 수 > " + maxNum(3, 5));
		System.out.println("=================================");
		
		System.out.println("절대갑: " + abs(-5));
		System.out.println("=================================");
		
		char[] arr = {'a', 'b', 'c'};
		String result6 = method06(arr);
		System.out.println("char배열: " + result6);
		System.out.println("=================================");
		
		int[] arr7 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("int 배열의 합: " + method07(arr7));
		System.out.println("=================================");
		
		String[] arr8 = method08("안녕하세요", "반갑습니다");
		System.out.println(Arrays.toString(arr8));
//		System.out.println("String 매개변수의 배열: " + Arrays.toString(method08("안녕하세요", "반갑습니다")));
		System.out.println("=================================");
		
	}
	
	static void method01() {
		System.out.println("안녕");
	}
	//전달 받은 매개 변수 리턴
	static String method02(String a) {
		String str = a;
		System.out.println("전달받은 매개변수: " + str);
		
		return str;
	}
	//세 매개변수 합 리턴
	static double method03(int a, int b, double c) {	
		double add = a + b + c;
		
		return add;	
	}
	//매개 변수가 짝수면 "짝수", 홀수라면 "홀수"리턴
	static String method04(int a) {
		String str = "";
		if(a%2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	//매개변수 int만큼  String 반복출력
	static void method05(int a) {
		for(int i = 0; i <= a; i++) {
			System.out.println("반복" + i + " ");
		}
	}	
	//매개변수 2개를 입력받아 큰 수 리턴
	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}	
	}
	
	//절대값 리턴
	static int abs(int a) {
		if(a < 0) {
			return -a;
		}else {
			return a;
		}
	}
	
	//char배열 요소를 문자열로 모두 붙여서 리턴
	static String method06(char[] a) {
		
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
		}
		
		return str;
	}
	
	//배열의 요소의 합을 리턴
	static int method07(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//매개변수를 배열에 저장하여 배열 리턴
	static String[] method08(String str1, String str2) {
		String[] arr = {str1, str2};
		
		return arr;
	}
	
	
	
	
}


























