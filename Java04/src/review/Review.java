package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1~ 10중 짝수만 출력하기
		// for(초기값; 조건식; 증감량){반복할 코드;}
//		for (int i = 1; i <= 10; ++i) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// 2. 정수형태 비밀번호 맞추기 ( 기회는 5번, 맞추면 맞췄다!, 기회를 모두 사용하면 접속 불가)
//		int pwd = 1234;
//		int user_input = 0;
//
//		for (int i = 0; i < 5; ++i) {
//			System.out.println("비밀번호를 입력하세요 >> ");
//			user_input = sc.nextInt();
//			if (user_input == pwd) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if (i == 4) {
//				System.out.println("접속 불가");
//			}
//		}

		// 3. 시험 합격점수는 국어, 영어 , 수학이 각각 40점 이상이고, 총 점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 과목점수가 40점 이상이나,총점이 미달되면 미달

		// 테스트케이스
		// 39, 40, 100 ==> 과락
		// 40, 40, 40 ==> 총점 미달
		// 40, 40, 100 ==> 합격 점수

//		int i = 40;
//		int j = 40;
//		int k = 100;
//		int sum = i + j + k;
//		if (i < 40) {
//			System.out.println("과락");
//		} 
//		else if(j < 40) {
//			System.out.println("과락");
//		}
//		else if(k < 40) {
//			System.out.println("과락");
//		}
//		else if (sum >= 150) {
//			System.out.println("합격점수");
//		}
//		else if( sum < 150) {
//			System.out.println("총점미달");
//		}
//		else if (i < 40 && sum >= 150) {
//			System.out.println("과락");
//		}
//		else if (i > 40 && sum < 150) {
//			System.out.println("총점미달");
//		}
//		else if (j < 40 && sum >= 150) {
//			System.out.println("과락");
//		}
//		else if (j > 40 && sum < 150) {
//			System.out.println("총점미달");
//		}
//		else if (k < 40 && sum >= 150) {
//			System.out.println("과락");
//		}
//		else if (k > 40 && sum < 150) {
//			System.out.println("총점미달");
//		}
//	}
//		

		// 4. 1 ~ 10까지의 합 구하기(반복문)
//		int sum = 0;
//		for(int i = 0; i < 11; i++) {
//			sum += i;
//	}
//		System.out.println(sum);
		
		//5. 10~ 1 까지 거꾸로 출력하기
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
	}
}