package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int num = 0;
		// for문을 통해서 구현해보세요
		
		// 1. 안녕 5번
		/*
		 for(i = 0; i < 6; i++){
		 System.out.println("안녕");
		 }
		 */
		
		// 2. 1~ 10 합계 구하기;
		/*
		 for(i = 5; i < 11; i++){
		 sum += i;
		 
		 System.out.println(sum);
		 }
		 */
		
		// 3. 1~ 입력값까지 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 >> ");
		num = sc.nextInt();
		for(i=1; i<num+1; i++) {
			sum += i;
			
			System.out.println(sum);
		}
	}
}	



