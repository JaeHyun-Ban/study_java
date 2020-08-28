package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};	//길이 10
		//4번째 인덱스의 삭제를 표현
		
		for(int i = 4; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁	"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학생의 별명을 입력하세요> ");
		String name = sc.next();
		
		int count = arr.length;	//사람수
		boolean flag = true; //값의 여부를 체크할 변수
		
		for(int i = 0; i < count; i++) { //탐색
			
			if(name.equals(arr[i])) { //삭제할 항목을 찾은 경우
				System.out.println(arr[i] + "을 삭제 합니다.");
				for(int j = i; j < count -1; j++) {
					arr[j] = arr[j+1]; //1칸씩 당겨서 삭제된 것처럼 보여준다.
				}
				count--; //count수를 줄여서 맨 마지막을 안보이게 한다
				flag = false;
			}
		}
		if(flag) {
			System.out.println("이름이 존재하지 않습니다.");
		}else {
			//삭제 후 정보를 보여준다
			System.out.println("=============삭제 후 정보=============");
			for(int i = 0; i < count; i++) {
				System.out.printf("%s ", arr[i]);
			}
			
		}
		
		
		
		
		
		
	}
}





































