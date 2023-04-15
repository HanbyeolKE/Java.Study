package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// # 1
		// try-catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니깐 try로 예외처리
		Scanner sc = new Scanner(System.in);
		MyClass6 mc6 = new MyClass6();
		
		System.out.println("숫자 1");
		int num1 = sc.nextInt();
		System.out.println("숫자 2");
		int num2 = sc.nextInt();
		try {
			mc6.divide(num1, num2);
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		// # 2
		// int a = sc.nextint(); 에 대한 예외처리(숫자를 입력해야 하는 함수에 문자열을 입력할 수 있음)
		System.out.println("숫자를 입력하세요");
		int a = 0;
		try {
			sc.nextInt();
		}catch(Exception e) {
			System.out.println("숫자 입력");
		}

		// 형변환 String -> int
		int c = 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("숫자만 가능 "+e);
		}
	}
}

class MyClass6{
	public void divide(int num1, int num2) {
		System.out.println(num1/num2);
	}
}