package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
	
	}
}

class MyRandom{
	// 0~9 랜덤
	public void go1() {
	Random random = new Random();
	int result = random.nextInt(10);		// 0 ~ 9까지 랜덤(0*10 ~ 0.9999*10)
	System.out.println(result);
	}
	
	public void go2() {
		// 100 ~ 105 까지 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100;
		System.out.println(result);
	}
	
	public void go3() {
		// 1~10 까지 랜덤
		Random random = new Random();
		int result = 
		System.out.println(result);
	}
}

// 싱글턴패턴 클래스로 생성하여 사용자에게 수자 2개를 입력받아 그 사이에서 랜덤을 돌려 리턴해주는 메서드
	public void go4() {
		Scanner sc = new Scanner(System.in);
		
	}