package day07;

import java.util.Scanner;

public class ran {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num= sc.nextInt();
		
		boolean flag = false;
		int ranarr[] = new int[num];
		
		while(true) {
			
			for(int i = 0; i < num; i++) {
				
				ranarr[i] = num;
				for(int j = 0; j < i; j++) {
					
					if(ranarr[j] == ranarr[i]) {
						
					}
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
































