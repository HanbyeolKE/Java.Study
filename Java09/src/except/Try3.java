package except;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		// Scanner로 nextLine으로 숫자를 입력받아서 int로 형변환
		// 예외처리까지
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = 0;
		
		a = Integer.parseInt(sc.nextLine());
		System.out.println(a);
		
		System.out.println("프로그램 종료");		// 어떤 입력값에도 무사히 도달할 수 있게끔
	}
}
