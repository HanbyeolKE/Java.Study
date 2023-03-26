package condition;

import java.util.Scanner;

public class If3 {
	//사용자에게 점수를 입력받고 점수가 90점 이상이면 우등생입니다 출력하는 프로그램 작성
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >>");
		num = sc.nextInt();
		
		if (num >= 90) {
			System.out.println("우등생입니다!");
		}
		else;
			System.out.println("우등생이 아닙니다!");
	}
}
