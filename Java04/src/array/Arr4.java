package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 국가와 수도 (5개)
		/*
		 * 대한민국의 수도는 서울입니다. 일본의 수도는 도쿄입니다. 중국의 수도는 베이징입니다. 미국의 수도는 워싱턴입니다. 러시아의 수도는
		 * 모스크바입니다.
		 */

		String names[] = { "Korea", "Japan", "China", "Usa", "Rusia" };
		String capital[] = { "Seoul", "Tokyo", "Beijing", "Wasington", "Moskva" };

		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i] + " - " + capital[i]);
		}
		String user_input = "";
		int bk_index = -1;
		System.out.println("나라 입력");
		user_input = sc.next();
		// 사용자 입력으로 국가를 받아서
		// 해당 국가의 수도를 알려주는 프로그램을 만들어보세요
		// 수도를 알고자 하는 국가의 이름을 입력하세요 >>
		// 대한민국 ==> 서울
		// 일본 ==> 도쿄

		// 같은 문자열을 찾으면 해당 i(방번호)를 백업
		// 백업한 방번호를 통해서 수도를 출력
		
		for(int i = 0; i < names.length; ++i) {
			if(user_input.equals(names[i])) {
				bk_index = i;
				break;
			}
		}
		if(bk_index == -1) {
			// 못찾았다
			System.out.println("해당 국가 없음");
		}
		else {
			// 찾았으니 같이 변경
			System.out.println(names[bk_index] + " - " + capital[bk_index]);
		}
	}
}
 