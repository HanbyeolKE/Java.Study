package loop;

public class Break1 {
	public static void main(String[] args) {
		// 제어문에는 같이 쓰일 수 있는 break, continue 가 있다
		// break : 반복문을 강제 종료 (자기를 감싸고 있는)
		while(true) {	//무한반복
			System.out.println("무한반복 시작!");
			
			if(true) {
				break;
			}
			System.out.println("위에서 이미 반복문이 종료되어 이곳은 경유하지 않습니다.");
		}
		System.out.println("반복문 종료");
	}
}
