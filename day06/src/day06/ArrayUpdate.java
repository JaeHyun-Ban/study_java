package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 학생의 별명을 입력> ");
		String name = sc.next();
		
		boolean flag = true; //값의 여부를 체크할 변수
		for(int i = 0; i < arr.length; i++) {
			
			if(name.equals(arr[i])) { //입력한 학생이 배열에 있는 경우
				System.out.println(arr[i] + "이름을 수정합니다.");
				System.out.print("> ");
				arr[i] = sc.next();
				flag = false; //변경되었다는 의미
			}
		
		}
		if(flag) {
			System.out.println("찾는 이름이 존재하지 않습니다.");
		}else {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
		
		
	}
}
























